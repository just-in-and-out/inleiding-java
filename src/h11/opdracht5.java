package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int counter = 0;
        int xy = 20;

        while (counter < 5){

            g.drawRect(xy,xy,20,20);
            xy += 20;
            counter ++;

        }

    }
}
