package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht7p2 extends Applet {

    public void init() {

        setSize(1980,1080);

    }

    public void paint(Graphics g) {

        int counter = 0;
        int x = 1000;
        int y = 500;
        int size = 0;

        while (counter < 1500){

            g.drawOval(x,y,size,size);
            x -= 1;
            y -= 1;
            size += 2;
            counter++;

        }
    }
}
