/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetie;

/**
 *
 * @author Nam
 */
public class Tweetie {
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Testing Singleton to open only one admin page.
                AdminPage page = AdminPage.getInstance();
                AdminPage page2 = AdminPage.getInstance();
                page.setVisible(true);
                page2.setVisible(true);
            }
        });
    }
}
