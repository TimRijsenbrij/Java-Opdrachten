package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
public class Opdracht5 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        int x = 50, y = 50;
        for (int i = 0; i < 5; i++) {
            x += 20;
            y += 20;
            g.drawRect(x, y, 20, 20);
        }
    }
}
