package Hoofdstuk13;
import java.applet.Applet;
import java.awt.*;
public class Opdracht1 extends Applet {
    public void paint(Graphics g) {
        tekenDriehoek(g);
    }
    public void tekenDriehoek(Graphics g) {
        g.drawPolygon(new int[]{50, 100, 100}, new int[]{50, 50, 100}, 3);
    }
}