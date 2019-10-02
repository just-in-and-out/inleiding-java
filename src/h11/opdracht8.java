package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht8 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int counter = 0;
        int x = 1000;
        int y = 500;
        int size = 6;

        while (counter <= 5000){

            g.drawOval(x,y,size,size);
            x -= 2;
            y -= 2;
            size += 4;
            counter++;
        }
    }
}
