package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    private Button[] buttons;
    private int aantal = 26;


    public void init() {
    buttons = new Button[aantal];
        for (int i = 1; i < aantal; i++) {
            Button bt = new Button("button " + i);
            buttons[i] = bt;
            add(bt);

        }
    }


}
