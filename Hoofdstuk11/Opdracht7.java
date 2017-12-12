package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht7 extends Applet {
    public void init() {
    this.setSize(1500, 1000);
    }
    public void paint(Graphics g) {
        int x = 300, y = 300, x2 = 5, y2 = 5;
        for (int i = 0; i < 50; i++) {
            x -= 5;
            y -= 5;
            x2 += 10;
            y2 += 10;
            g.drawOval(x, y, x2, y2);
        }
    }
}
