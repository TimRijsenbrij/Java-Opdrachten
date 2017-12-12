package Hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PraktijkOpdracht2 extends Applet {
    Button button;
    int a1;
    boolean errorcode;
    public void init() {
        this.setSize(340, 250);
        button = new Button("test uit!");
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);
        add(button);
    }
    public void paint(Graphics g) {
        int y = 20;
        if (!errorcode) {
            for (int i = 1; i <= 10; i++) {
                g.drawString(i + " * " + a1 + " = " + i * a1, 75, y);
                y = y + 20;
            }
        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a1++;
            errorcode = false;
            if (a1 < 1 || a1 > 10) {
                a1 = 1;
            }
            repaint();
        }
    }
}