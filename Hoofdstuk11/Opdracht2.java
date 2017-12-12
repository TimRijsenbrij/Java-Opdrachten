package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht2 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        int teller = 20;
        int x = 50;
        do {
            x += 20;
            g.drawString("" + teller, x, 50);
            teller--;
        } while (teller > 9);
    }
}