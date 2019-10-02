package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    int a1 = 0;
    int a2 = 0;
    int b1 = 0;
    int b2 = 0;
    int c1 = 0;
    int c2 = 0;
    int d1 = 0;
    int add1 = 0;
    int add2 = 0;
    int color_choser = 0;
    
    private void draw_wall(Graphics g, int x1, int y1, int x2, int y2, int w1, int w2, int b1){

        if (color_choser == 1){
            g.setColor(Color.red);
        }

        if (color_choser == 2){
            g.setColor(Color.gray);
        }

        g.fillRect(x1,y1,w1,b1);
        g.fillRect(x2,y2,w2,b1);
        g.setColor(Color.black);
        g.drawRect(x1,y1,w1,b1);
        g.drawRect(x2,y2,w2,b1);

    }

    public void init() {

        setSize(4000,2000);

        Button brick = new Button("brick");
        brick.addActionListener(new bricklistener());
        add(brick);

        Button concrete = new Button("concrete");
        concrete.addActionListener(new concretelistener());
        add(concrete);

    }

    public void paint(Graphics g) {

        draw_wall(g,a1,a2,b1,b2,c1,c2,d1);
        draw_wall(g,a1,a2+d1*2,b1,b2+d1*2,c1,c2,d1);
        a1 +=add1;
        b1 +=add2;

        for (int counter = 0; counter < 10; counter++){

            draw_wall(g,a1,a2,b1,b2,c2,c2,d1);
            draw_wall(g,a1,a2+d1*2,b1,b2+d1*2,c2,c2,d1);
            a1 += add2;
            b1 += add2;

            draw_wall(g,a1,a2,b1,b2,c2,c2,d1);
            draw_wall(g,a1,a2+d1*2,b1,b2+d1*2,c2,c2,d1);
            a1 += add2;
            b1 += add2;

        }

        draw_wall(g,a1,a2,b1,b2,c2,c1,d1);
        draw_wall(g,a1,a2+d1*2,b1,b2+d1*2,c2,c1,d1);
    }

    class bricklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            a1 = 20;
            a2 = 30;
            b1 = 20;
            b2 = 50;
            c1 = 20;
            c2 = 40;
            d1 = 20;
            add1 = 20;
            add2 = 40;
            color_choser = 1;

            repaint();
        }
    }

    class concretelistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            a1 = 20;
            a2 = 30;
            b1 = 20;
            b2 = 60;
            c1 = 50;
            c2 = 50;
            d1 = 30;
            add1 = 50;
            add2 = 50;
            color_choser = 2;

            repaint();
        }
    }
}
