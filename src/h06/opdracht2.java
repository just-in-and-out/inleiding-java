package h06;

import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet{

    int a,b,c;
    int total_u;
    int total_d;
    int total_y;

    public void init (){

        int a = 60;
        int b = 24;
        int c = 365;

        total_u = a*a;
        total_d = total_u*b;
        total_y = total_d*c;

    }

    public void paint(Graphics g){

        g.drawString("there are" +total_u,20,20);
        g.drawString("seconds in a hour",100,20);
        //3600

        g.drawString("there are" +total_d,20,40);
        g.drawString("seconds in a day",105,40);
        //86400

        g.drawString("there are" +total_y,20,60);
        g.drawString("seconds in a year",125,60);
        //31536000

    }
}
