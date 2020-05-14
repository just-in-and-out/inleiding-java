package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    Button[] buttons;

    public void init() {

        buttons = new Button[25];

        for (int i = 0; i < buttons.length; i++) {
            Button button = new Button();
            buttons[i] = button;
        }
        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i]);
        }
    }

    public void paint(Graphics g) {

    }
}
