package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int teller;
        int y = 0;
        int total;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            total = 20-teller;

            g.drawString("" + total,20,y);
        }

    }
}
