package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PraktijkOpdracht1 extends Applet {
    TextField tekstvak;
        Button knop;
        int a1;
    public void init() {
        this.setSize(340, 250);
        tekstvak = new TextField(20);
        add(tekstvak);
        knop = new Button("test uit!");
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);
    }
    public void paint(Graphics g) {
        int y = 60;
        for (int i = 1; i <= 10; i++) {
            g.drawString(i + " * " + a1 + " = " + i * a1, 75, y);
            y = y + 20;
        }
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            a1 = Integer.parseInt(s);
            repaint();
        }
    }
}
