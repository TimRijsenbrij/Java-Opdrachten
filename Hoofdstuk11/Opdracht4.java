package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht4 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        int A = 0, B = 3, C;
        int x = 10;
        for (int i = 0; i < 25; i++) {
            x += 50;
            C = A + B;
            A = C;
            g.drawString("" + C, x, 30);
        }
    }
}
