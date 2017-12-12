package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht8 extends Applet {
    public void init() {
        this.setSize(1500, 1000);
    }
    public void paint(Graphics g) {
        int x = 50, y = 50, x2 = 5, y2 = 5;
        for (int i = 0; i < 8; i++) {
            x2 += 6;
            y2 += 6;
            g.drawOval(x, y, x2, y2);
        }
    }
}
