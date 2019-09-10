package h06;

import java.awt.*;
import java.applet.*;

public class opdracht3 extends Applet{

    int a,b;
    int total;

    public void init(){

     int a = 1000000000;
     int b = 2000000000;

     total = a+b;

    }

    public void paint(Graphics g){

        g.drawString("1000000000 + 2000000000 = " +total,20,20);

    }
}
