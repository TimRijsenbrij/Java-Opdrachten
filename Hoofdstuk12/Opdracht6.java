package Hoofdstuk12;
import java.applet.Applet;
import java.awt.*;
public class Opdracht6 extends Applet {
    int[] getallen = {2, 2, 2, 3, 3, 3, 3, 3};
    Button knop;
    TextField tekstvak;
    int input;
    int getal;
    boolean komtvoor;
    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);
        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(e -> {
            getal = 0;
            komtvoor = true;
            input = Integer.parseInt(tekstvak.getText());
            for (int getal : getallen) {
                if (getal == input) {
                    getal++;
                }
            }
            repaint();
        });
    }
    public void paint(Graphics g) {
        if (komtvoor) {
            g.drawString("Het getal " + input + " komt " + getal + " keer voor", 20, 80);
        }
    }
}

