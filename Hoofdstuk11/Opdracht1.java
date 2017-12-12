package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht1 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        int teller = 0;
        int x = 50;
        do {
            x += 20;
            g.drawLine(x, 50, x, 275 );
            g.drawString("" + teller, x, 295 );
            teller++;
        } while (teller < 10);
    }
}
