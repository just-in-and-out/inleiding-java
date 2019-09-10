package h04;

import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet{

    public void init(){

    }

    public void paint(Graphics g){
        g.drawRect(50,100,100,60);
        g.drawLine(50,100,100,60);
        g.drawLine(150,100,100,60);
        g.drawRect(60,110,20,20);
        g.drawLine(70,110,70,130);
        g.drawLine(60,120,80,120);
        g.drawRect(120,130,20,30);
        g.drawRect(134,144,2,2);
    }
}
