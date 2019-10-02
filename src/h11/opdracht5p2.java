package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht5p2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int counter1 = 0;
        int counter2 = 0;
        int xy1 = 20;
        int x2 = 120;
        int y2 = 80;

        while (counter1 < 7){

            g.setColor(Color.blue);
            g.fillRect(xy1,xy1,20,20);
            xy1 += 20;
            counter1 ++;

        }

        while (counter2 < 3){

            g.setColor(Color.black);
            g.fillRect(x2,y2,20,20);
            x2 -=20;
            y2 +=20;
            counter2++;
        }

    }
}
