package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    private TextField[] textFields;

    private final int aantaltf = 5;



    public void init() {

        textFields = new TextField[aantaltf];

        for (int i = 0; i < aantaltf; i++) {
            TextField tf = new TextField(5);
            textFields[i] = tf;
            add(tf);
        }
        Button button = new Button("test uit!");
        add(button);


        button.addActionListener(e -> {
            int[] invoer = new int[aantaltf];
            for (int i = 0; i < aantaltf; i++) {
                String s = textFields[i].getText();
                int input = Integer.parseInt(s);
                invoer[i] = input;
            }
            Arrays.sort(invoer);
            repaint();

            for (int i = 0; i < aantaltf; i++) {
                textFields[i].setText(String.valueOf(invoer[i]));
            }
        });


    }



}
