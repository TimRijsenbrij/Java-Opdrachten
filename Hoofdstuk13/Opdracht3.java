package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button knop;
    Button button;
    int x = 100;
    int y = 100;
    int y2 = 250;


    public void init() {
        knop = new Button("rode muur");
        knopListener kl = new knopListener();
        knop.addActionListener(kl);
        add(knop);

        button = new Button("grijze muur");
        buttonListener bl = new buttonListener();
        button.addActionListener(bl);
        add(button);
    }

    public void paint(Graphics g) {
        muren(g);
    }

    public void muren(Graphics g) {

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 15; i++) {
                Graphics g = getGraphics();
                g.setColor(Color.red);
                g.fillRect(x, y, 20, 10);
                g.fillRect(x - 10, y + 10, 20, 10);
                g.fillRect(x, y + 20, 20, 10);
                g.fillRect(x - 10, y + 30, 20, 10);
                g.fillRect(x, y + 40, 20, 10);
                g.fillRect(x - 10, y + 50, 20, 10);
                x = x + 20;
            }
        }
    }

    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 15; i++) {
                Graphics g = getGraphics();
                g.setColor(new Color(100, 100, 100));
                g.fillRect(x, y, 20, 10);
                g.fillRect(x - 10, y + 10, 20, 10);
                g.fillRect(x, y + 20, 20, 10);
                g.fillRect(x - 10, y + 30, 20, 10);
                g.fillRect(x, y + 40, 20, 10);
                g.fillRect(x - 10, y + 50, 20, 10);
                x = x + 20;

            }
        }
    }

}
