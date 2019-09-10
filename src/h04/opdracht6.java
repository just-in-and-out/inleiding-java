package h04;

import java.awt.*;
import java.applet.*;

public class opdracht6 extends Applet{

    public void init(){

    }

    public void paint(Graphics g){

        g.fillRoundRect(50,50,100,250,15,15);
        g.setColor(Color.red);
        g.fillOval(75,75,50,50);
        g.setColor(Color.orange);
        g.fillOval(75,150,50,50);
        g.setColor(Color.green);
        g.fillOval(75,225,50,50);
        g.setColor(Color.darkGray);
        g.fillArc(50,45,100,25,0,180);

    }
}
