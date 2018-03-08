package Hoofdstuk12;
import java.applet.Applet;
import java.awt.*;
public class Opdracht1 extends Applet {
    int[] getallen = {10, 20, 50, 40, 30};
    int totaal;
    public void init() {
    }
    public void paint(Graphics g) {
        for (int i = 0; i < getallen.length; i++) {
            totaal = 10 + 20 + 30 + 40 + 50;
        }
        g.drawString("Het gemiddelde is: " + totaal / getallen.length, 50, 20);
    }
}
