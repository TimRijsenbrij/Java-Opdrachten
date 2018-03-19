package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    int x1 = 40;
    int x2 = 60;
    int x3 = 80;
    int x4 = 75;



    public void paint(Graphics g) {
        bomen(g);
    }

    public void bomen(Graphics g){
        for (int i = 0; i < 6; i++);

        g.setColor(Color.green);
        g.fillOval(x1, 100, 50, 50);
        g.fillOval(x2, 80, 50, 50);
        g.fillOval(x3,  100, 50, 50);
        g.setColor(new Color(150, 79, 18));
        g.fillRect(x4, 140, 15, 50);
        x1 = x1 + 80;
        x2 = x2 + 80;
        x3 = x3 + 80;
        x4 = x4 + 80;
    }


}