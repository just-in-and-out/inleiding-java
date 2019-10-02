package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int counter = 0;
        int x = 100;
        int y = 100;
        int size = 20;

        while (counter < 5){

            g.drawOval(x,y,size,size);
            x -= 10;
            y -= 10;
            size += 20;
            counter++;
        }

    }
}
