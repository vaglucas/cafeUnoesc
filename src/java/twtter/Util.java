/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twtter;

import cliente.Cliente;
import dao.TwitterDAO;
import dao.TwitterDaoImpl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author vag
 */
public class Util {

    private String text;
    private int sensor = 1;
    private int vdd = 0;
    private Socket cliente;
    private String enderecoServidor = "localhost";
    private int portaServidor = 6000;

    public void buscarTweet(String hashtag) throws TwitterException, UnknownHostException, IOException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("XE7JktBE0Ua4rJnXxYQug")
                .setOAuthConsumerSecret("PF8zHyjl1USDL0k5IDQkTnt2BbSRyzv3riNBawiZPE")
                .setOAuthAccessToken("1434188233-QdE7xvGkEvuoIt4sXOCFAZoa6WH1tjMywGOMvZN")
                .setOAuthAccessTokenSecret("BNZz5k15ggmX6Rb5qhwPlnNFB5Tn7i1i3dYf0kYgrA")
                .setUser("CafeUnoesc")
                .setPassword("cafe1234")
                .setHttpProxyHost("jba-proxy.unoesc.lan")
                .setHttpProxyUser("miguel.camarotto")
                .setHttpProxyPassword("26392013")
                .setHttpProxyPort(80);
        TwitterDAO ttDAO = new TwitterDaoImpl();
        AsyncTwitterFactory factory = new AsyncTwitterFactory();
        AsyncTwitter asyncTwitter = factory.getInstance();
        model.Twitter tt = new model.Twitter();

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        DirectMessage m = null;
        Query query = new Query(hashtag);

        Date hoje = new Date();
        QueryResult result = null;
        System.out.println("BEM VINDO AO CAFE UNOESC");
        System.out.println(">>>>>>>>><<<<<<<<<<<<<");
        result = twitter.search(query);
        int time;
        String idtt = "";
        for (Status status : result.getTweets()) {


            time = status.getCreatedAt().getMinutes() + 5;
            System.out.println("Verificando o tt de: " + status.getUser().getScreenName());
            idtt = ttDAO.getTwittersPorId(String.valueOf(status.getId()));
            if (idtt.equals(String.valueOf(status.getId()))) {
                System.out.println("Twiiter ja respondido: (" + status.getText() + ")");
                vdd = 1;
            }
            if (sensor == 0) {
                twitter.updateStatus("@" + status.getUser().getScreenName() + ", desculpe nossa cafeteira está temporariamente of =[");
                System.out.println("desculpe nossa cafeteira está temporariamente desligada...");
            }
            if (status.getUser().getScreenName().equals("CafeUnoesc")) {
                System.out.println("Olha eu aqui.......");
            }
            if (status.getText().equals("@CafeUnoesc #ligarCafeteira") && sensor == 1
                    && status.getUser().getScreenName().equals("vaglucas") && vdd == 0
                    || status.getUser().getScreenName().equals("sonambulambo") && vdd == 0
                    || status.getUser().getScreenName().equals("eliezerbernart") && vdd == 0
                    || status.getUser().getScreenName().equals("luanrossa") && vdd == 0) {

                twitter.updateStatus("@" + status.getUser().getScreenName() + " Preparando seu café " + " Nº do pedido" + Math.random() * 100000);
                System.out.println("Preparando seu café  @" + status.getUser().getScreenName() + " Nº do pedido" + Math.random() * 100000);
                tt.setIdTwitter(String.valueOf(status.getId()));
                tt.setText(status.getText());
                tt.setUsuario(status.getUser().getScreenName());
                tt.setData(status.getCreatedAt());
                tt.setStatus("SIM");
                ttDAO.incluir(tt);
                vdd = 0;
                try {
                    cliente = new Socket(this.enderecoServidor, this.portaServidor);

                    DataInputStream inbound = new DataInputStream(cliente.getInputStream());
                    DataOutputStream outbound = new DataOutputStream(cliente.getOutputStream());

                    outbound.write("#L".getBytes());
                    String end = Integer.toHexString(26);
                    outbound.write(end.getBytes());
                    char a;
                    do {
                        a = (char) inbound.readByte();
                        if (a == 0x1A) {
                             end = Integer.toHexString(26);
                            outbound.write(end.getBytes());
                            cliente.close();
                            inbound.close();
                            outbound.close();
                        }
                        System.out.println(String.valueOf(a));
                    } while (inbound.available() > 0);

                    cliente.close();
                } catch (ConnectException ex) {
                    JOptionPane.showMessageDialog(null, "Problemas de comunicação com o servidor!", "Erro", JOptionPane.ERROR_MESSAGE);
                }



            }
            if (vdd == 0 && sensor == 1 && status.getText().equals("@CafeUnoesc #temcaféai")) {

                twitter.updateStatus("@" + status.getUser().getScreenName() + " Aqui tem café");
                System.out.println("temos café @" + status.getUser().getScreenName());
                tt.setIdTwitter(String.valueOf(status.getId()));
                tt.setText(status.getText());
                tt.setUsuario(status.getUser().getScreenName());
                tt.setData(status.getCreatedAt());
                tt.setStatus("NAO");
                ttDAO.incluir(tt);
            }
            if (vdd == 0 && sensor == 1 && !status.getUser().getScreenName().equals("vaglucas") && !status.getUser().getScreenName().equals("sonambulambo")
                    && !status.getUser().getScreenName().equals("eliezerbernart") && !status.getUser().getScreenName().equals("luanrossa")
                    && !status.getUser().getScreenName().equals("CafeUnoesc")) {
                twitter.updateStatus("@" + status.getUser().getScreenName() + " desculpe, vc não tem direito a café..." + status.getUser().getScreenName());
                System.out.println("sem cafe para vc");
                tt.setIdTwitter(String.valueOf(status.getId()));
                tt.setText(status.getText());
                tt.setUsuario(status.getUser().getScreenName());
                tt.setStatus("NAO");

                tt.setData(status.getCreatedAt());
                ttDAO.incluir(tt);
            } else if (vdd == 0 && sensor == 1 && !status.getText().equals("@CafeUnoesc #ligarCafeteira")) {
                twitter.updateStatus("@" + status.getUser().getScreenName() + " vc não pediu café? gostaria de um café? " + status.getUser().getScreenName());
                System.out.println("vc não pediu café? gostaria de um café?" + status.getUser().getScreenName());
                tt.setIdTwitter(String.valueOf(status.getId()));
                tt.setText(status.getText());
                tt.setUsuario(status.getUser().getScreenName());
                tt.setData(status.getCreatedAt());
                tt.setStatus("NAO");

                ttDAO.incluir(tt);
            } else {
                System.out.println(">>>>>>>>><<<<<<<<<<<<<");
            }
        }
    }
}
