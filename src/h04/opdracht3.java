package h04;

import java.awt.*;
import java.applet.*;

public class opdracht3 extends Applet{

    public void init(){

    }

    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(0,0,999,200);
        g.setColor(Color.green);
        g.fillRect(0,200,999,999);
        g.setColor(Color.red);
        g.fillRect(20, 100, 75, 15);
        g.setColor(Color.WHITE);
        g.fillRect(20,115,75,15);
        g.setColor(Color.blue);
        g.fillRect(20,130,75,15);
        g.setColor(Color.black);
        g.fillRect(15,100,5,100);
        g.drawRect(20,100,75,45);
    }
}
