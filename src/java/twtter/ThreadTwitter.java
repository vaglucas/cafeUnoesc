/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twtter;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.TwitterException;
import twtter.Util;

/**
 *
 * @author vag
 */
public class ThreadTwitter extends Thread implements Runnable {

    private Util u = new Util();
    private volatile boolean ativar = true;

    @Override
    public void run() {
        int i = 0;
        while (ativar) {
            try {
                System.out.println("........");

                System.out.println("Vericicação Nº " + i++);
                Util u = new Util();
                u.buscarTweet("@CafeUnoesc");
                Thread.sleep(5000);


            } catch (TwitterException ex) {
                Logger.getLogger(ThreadTwitter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTwitter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(ThreadTwitter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ThreadTwitter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void parar() {
        this.interrupt();
        return;
    }
}