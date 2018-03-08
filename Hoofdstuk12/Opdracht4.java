package Hoofdstuk12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Opdracht4 extends Applet {
    double[] getallen = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
    Button knop;
    TextField tekstvak;
    double input;
    boolean komtvoor = false;
    double getal;
    String uitslag;
    public void init() {
        input = 0;
        tekstvak = new TextField(10);
        knop = new Button("Zit het er in?");
        add(tekstvak);
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Double.parseDouble(tekstvak.getText());
            for (int i = 0; i != getallen.length; i++)
                getal = getallen[i];

                if (getal == input) {
                    komtvoor = true;

            }
            repaint();
        }
    }
    public void paint(Graphics g) {
        uitslag = "Staat het getal in de lijst?";
        g.drawString(uitslag, 50, 50);
        if (komtvoor) {
            g.drawString("het staat in de lijst!", 50, 70);
        } else {
            g.drawString("het staat niet in de lijst.", 50, 90);
        }
    }
}






