package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {

    public void init() {

        setSize(9001,1000);

    }

    public void paint(Graphics g) {

        int counter = 0;
        int x = 1000;
        int y = 500;
        int size = 20;

        while (counter < 50){

            g.drawOval(x,y,size,size);
            x -= 10;
            y -= 10;
            size += 20;
            counter++;

        }
    }
}
