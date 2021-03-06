/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eliezer
 */
public class CafeUnoescClienteSimulator extends javax.swing.JFrame {

    /**
     * Creates new form CafeUnoescClienteSimulator
     */
    public CafeUnoescClienteSimulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoIpServidor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoPortaEscuta = new javax.swing.JTextField();
        botaoLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoPedido = new javax.swing.JTextArea();
        botaoEnviarPedido = new javax.swing.JButton();
        botaoLimparPedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoResposta = new javax.swing.JTextArea();
        botaoEnviarPedido1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CaféUnoesc Simulador de Cliente");

        jLabel1.setText("Ip do Servidor: ");

        campoIpServidor.setText("127.0.0.1");

        jLabel2.setText("Porta de Escuta:");

        campoPortaEscuta.setText("2013");

        botaoLimparCampos.setText("Limpar Campos");
        botaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIpServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPortaEscuta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(botaoLimparCampos)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoIpServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(campoPortaEscuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimparCampos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textoPedido.setColumns(20);
        textoPedido.setRows(5);
        jScrollPane1.setViewportView(textoPedido);

        botaoEnviarPedido.setText("Enviar Pedido");
        botaoEnviarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarPedidoActionPerformed(evt);
            }
        });

        botaoLimparPedido.setText("Limpar Pedido");
        botaoLimparPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparPedidoActionPerformed(evt);
            }
        });

        textoResposta.setEditable(false);
        textoResposta.setColumns(20);
        textoResposta.setRows(5);
        jScrollPane2.setViewportView(textoResposta);

        botaoEnviarPedido1.setText("Limpar Resposta");
        botaoEnviarPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarPedido1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Campo para o pedido:");

        jLabel4.setText("Campo para a resposta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEnviarPedido1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoLimparPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoEnviarPedido)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimparPedido)
                    .addComponent(botaoEnviarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEnviarPedido1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCamposActionPerformed
        campoIpServidor.setText("");
        campoPortaEscuta.setText("");
    }//GEN-LAST:event_botaoLimparCamposActionPerformed

    private void botaoEnviarPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarPedido1ActionPerformed
        textoResposta.setText("");
    }//GEN-LAST:event_botaoEnviarPedido1ActionPerformed

    private void botaoLimparPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparPedidoActionPerformed
        textoPedido.setText("");
    }//GEN-LAST:event_botaoLimparPedidoActionPerformed

    private void botaoEnviarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarPedidoActionPerformed
        try {
            Cliente cliente = new Cliente(campoIpServidor.getText(), Integer.parseInt(campoPortaEscuta.getText()), textoResposta);
            cliente.fazerPedido(textoPedido.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Digite um número válido na porta de comunicação!","Erro",JOptionPane.ERROR_MESSAGE);
        } catch (UnknownHostException ex) {
            Logger.getLogger(CafeUnoescClienteSimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CafeUnoescClienteSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoEnviarPedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CafeUnoescClienteSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CafeUnoescClienteSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CafeUnoescClienteSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CafeUnoescClienteSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CafeUnoescClienteSimulator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviarPedido;
    private javax.swing.JButton botaoEnviarPedido1;
    private javax.swing.JButton botaoLimparCampos;
    private javax.swing.JButton botaoLimparPedido;
    private javax.swing.JTextField campoIpServidor;
    private javax.swing.JTextField campoPortaEscuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textoPedido;
    private javax.swing.JTextArea textoResposta;
    // End of variables declaration//GEN-END:variables
}
