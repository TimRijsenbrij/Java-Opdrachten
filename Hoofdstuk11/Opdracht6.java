package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht6 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        int x = 100, y = 100, x2 = 10, y2 = 10;
        for (int i = 0; i < 5; i++) {
            x -= 10;
            y -= 10;
            x2 += 20;
            y2 += 20;
            g.drawOval(x, y, x2, y2);
        }
    }
}
