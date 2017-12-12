package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht9 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        g.drawLine(90, 50, 250, 50);
        g.drawLine(250, 50, 250, 210);
        g.drawLine(250, 210, 90, 210);
        g.drawLine(89, 210, 89, 50);
        int x = 50, y = 50, x2 = 20, y2 = 20;
        for (int i = 0; i < 4; i++) {
            x += 40;
            g.fillRect(x, y, x2, y2);
            g.fillRect((20 + x), 70, x2, y2);
            g.fillRect(x, 90, x2, y2);
            g.fillRect((20 + x), 110, x2, y2);
            g.fillRect(x, 130, x2, y2);
            g.fillRect((20 + x), 150, x2, y2);
            g.fillRect(x, 170, x2, y2);
            g.fillRect((20 + x), 190, x2, y2);
        }
    }

}