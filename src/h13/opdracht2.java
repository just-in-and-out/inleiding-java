package h13;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    void draw_wall(Graphics g, int x1, int y1, int x2, int y2, int w1, int w2) {

        g.setColor(Color.red);
        g.fillRect(x1,y1,w1,20);
        g.setColor(Color.black);
        g.drawRect(x1,y1,w1,20);
        g.setColor(Color.red);
        g.fillRect(x2,y2,w2,20);
        g.setColor(Color.black);
        g.drawRect(x2,y2,w2,20);

    }

    public void init() {

    }

    public void paint(Graphics g) {

        int a1 = 20;
        int a2 = 20;
        int b1 = 20;
        int b2 = 40;
        int c1 = 20;
        int c2 = 40;

        draw_wall(g,a1,a2,b1,b2,c1,c2);

        a1+=20;
        b1+=40;
        c1=40;
        c2=40;

       for (int counter = 0; counter < 10; counter++){

           draw_wall(g,a1,a2,b1,b2,c1,c2);

           a1+=40;
           b1+=40;
           c1=40;
           c2=40;

           draw_wall(g,a1,a2,b1,b2,c1,c2);

           a1+=40;
           b1+=40;

       }

       b1=0;
       b2=0;
       c1=20;
       c2=0;
       draw_wall(g,a1,a2,b1,b2,c1,c2);

    }
}