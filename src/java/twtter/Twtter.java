/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twtter;

import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Timer;
import twitter4j.*;

public class Twtter {

    public static void main(String[] args) throws TwitterException, SQLException, InterruptedException, UnknownHostException, IOException {
        int i = 0;
        while (true) {
            System.out.println("........");

            System.out.println("Vericicação Nº " + i++);
            Util u = new Util();
            u.buscarTweet("@CafeUnoesc");
            Thread.sleep(5000);
        }
    }

    public void Busca() throws TwitterException, InterruptedException, UnknownHostException, IOException {
        int i = 0;
        while (true) {
            System.out.println("........");

            System.out.println("Vericicação Nº " + i++);
            Util u = new Util();
            u.buscarTweet("@CafeUnoesc");
            Thread.sleep(5000);
        }

    }
}