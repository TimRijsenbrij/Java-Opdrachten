package Hoofdstuk12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Opdracht5 extends Applet {
    int[] getallen = {2, 3, 4, 9, 10, 24, 21, 6};
    TextField tekstvak;
    Button knop;
    int input;
    int selected;
    boolean komtvoor;
    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);
        knop = new Button("Test uit!");
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            komtvoor = false;
            input = Integer.parseInt(tekstvak.getText());
            for (int i = 0; i != getallen.length; i++)
                selected = getallen[i];
            if (selected == input) {
                komtvoor = true;
            }
            repaint();
         }
    }
    public void paint(Graphics g) {
        if (komtvoor) {
            g.drawString("ja man je kan goed gokken", 50, 50);
        }
        else {
            g.drawString("helaas helaas", 50, 50);

        }
    }
}
