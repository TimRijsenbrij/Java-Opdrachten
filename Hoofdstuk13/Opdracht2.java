package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int y = 100;
    int x = 100;


    public void paint(Graphics g) {
        tekenbaksteen(g);
    }

    public void tekenbaksteen(Graphics g) {
        for (int i = 0; i < 30; i++) {
            x = x + 20;
            g.drawRect(x, y, 20, 10);
            g.drawRect(x + 10, y + 10, 20, 10);
            g.drawRect(x, y + 20, 20, 10);
            g.drawRect(x + 10, y + 30, 20, 10);
            g.drawRect(x, y + 40, 20, 10);
            g.drawRect(x + 10, y + 50, 20, 10);
        }


    }
}