/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Eliezer
 */
public class Cliente {

    private Socket cliente;
    private String enderecoServidor;
    private int portaServidor;
    private JTextArea textoResposta;

    public Cliente(String enderecoServidor, int portaServidor, JTextArea textoResposta) {
        this.enderecoServidor = enderecoServidor;
        this.portaServidor = portaServidor;
        this.textoResposta = textoResposta;
    }

    public void fazerPedido(String pedido) throws UnknownHostException, IOException {
        try {
            this.cliente = new Socket(this.enderecoServidor, this.portaServidor);
            textoResposta.append("Seu pedido será enviado para o endereço " + enderecoServidor + ":" + portaServidor + "...\n");

            DataInputStream inbound = new DataInputStream(cliente.getInputStream());
            DataOutputStream outbound = new DataOutputStream(cliente.getOutputStream());

            outbound.write(pedido.getBytes());
            textoResposta.append("Pedido enviado: " + pedido + "...\n");

            textoResposta.append("Resposta do servidor: ");
            char a;
            do {
                a = (char) inbound.readByte();
                if (a == 0x1A) {
                    String end = Integer.toHexString(26);
                    outbound.write(end.getBytes());
                    cliente.close();
                    inbound.close();
                    outbound.close();
                }
                this.textoResposta.append(String.valueOf(a));
            } while (inbound.available() > 0);

            cliente.close();
            textoResposta.append("--------------------------------------------------------------- \n");
        } catch (ConnectException ex) {
            JOptionPane.showMessageDialog(null, "Problemas de comunicação com o servidor!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
