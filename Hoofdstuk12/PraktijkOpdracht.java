package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    int jan = 1234567;
    int jennie = 1234567;
    int sjon = 1234567;
    int piet = 1234567;
    int klaas = 1234567;
    int achmed = 1234567;
    int tim = 1234567;
    int kevin = 1234567;
    int iemand = 1234567;
    int kijktuwelhiernaar = 1234567;
    Button knop;
    TextField tekstvak;
    String input;
    String tekst;

    public void init() {
        knop = new Button("Test mij uit!");
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);
        tekstvak = new TextField(10);
        add(tekstvak);

    }


    public void paint(Graphics g) {
        g.drawString(tekst,40,100);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        input = tekstvak.getText().toLowerCase();
        switch (input){
            case "jan":
                 tekst = "Jan's nummer is " + jan;
                break;
            case "jennie":
                tekst = "Jennie's nummer is " + jennie;
                break;
            case "sjon":
                tekst = "Sjon's nummer is " + sjon;
                break;
            case "piet":
                tekst = "Piet's nummer is " + piet;
                break;
            case "klaas":
                tekst = "Klaas's nummer is " + klaas;
                break;
            case "achmed":
                tekst = "Achmed's nummer is " + achmed;
                break;
            case "tim":
                tekst = "tim's nummer is " + tim;
                break;
            case "kevin":
                tekst = "Jan's nummer is " + kevin;
                break;
            case "iemand":
                tekst = "iemand's nummer is " + iemand;
                break;
            case "kijktuwelhiernaar":
                tekst = "kijktuwelhiernaar's nummer is" + kijktuwelhiernaar;
                break;
        }
        repaint();
        }

    }
}

