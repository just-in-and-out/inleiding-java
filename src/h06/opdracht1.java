package h06;

import java.awt.*;
import java.applet.*;

public class opdracht1 extends Applet{

    int a;
    double uitkomst;

    public void init(){

        double a = 113;

        uitkomst = a/4;

    }

    public void paint(Graphics g){

        g.drawString("de uitkomst is " + uitkomst,20,20);
        //28.25
    }

}
