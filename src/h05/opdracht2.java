package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    Color ValerieC;
    Color JeroenC;
    Color HansC;
    Color Origenal;

    int Valerieh;
    int Jeroenh;
    int Hansh;

    public void init() {

        ValerieC = Color.green;
        JeroenC = Color.red;
        HansC = Color.blue;
        Origenal = Color.black;

        Valerieh = 40;
        Jeroenh = 100;
        Hansh = 80;

    }

    public void paint(Graphics g){

        g.drawLine(50,20,50,140);
        g.drawLine(50,140,170,140);
        g.drawString("120",25,25);
        g.drawString("100",25,45);
        g.drawString("80",30,65);
        g.drawString("60",30,85);
        g.drawString("40",30,105);
        g.drawString("20",30,125);
        g.drawString("0",35,145);

        g.drawString("Valerie",180,50);
        g.setColor(ValerieC);
        g.fillRect(65,140-Valerieh,20,Valerieh);
        g.fillRect(220,40,10,10);

        g.setColor(Origenal);
        g.drawString("Jeroen",180,70);
        g.setColor(JeroenC);
        g.fillRect(90,140-Jeroenh,20,Jeroenh);
        g.fillRect(220,60,10,10);

        g.setColor(Origenal);
        g.drawString("Hans",180,90);
        g.setColor(HansC);
        g.fillRect(115,140-Hansh,20,Hansh);
        g.fillRect(220,80,10,10);

    }

}
