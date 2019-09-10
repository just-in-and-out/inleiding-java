package h04;

import java.awt.*;
import java.applet.*;

public class opdracht5 extends Applet{

    public void init(){

        setBackground(Color.blue);

    }

    public void paint(Graphics g){

        g.setColor(Color.yellow);

        g.fillArc(50,50,200,100,90,360);
    }
}
