package h12;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    Button kopie;
    int aantal = 0;

    public void init() {

        while (aantal < 25){

            kopie = new Button("ok");
            add(kopie);

            aantal++;
        }
    }

    public void paint(Graphics g) {

    }
}
