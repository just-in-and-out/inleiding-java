package h04;

import java.awt.*;
import java.applet.*;

public class opdracht4 extends Applet{

    public void init(){

    }

    public void paint(Graphics g){
        g.drawLine(50,50,50,170);
        g.drawString("120",25,55);
        g.drawString("100",25,75);
        g.drawString("80",30,95);
        g.drawString("60",30,115);
        g.drawString("40",30,135);
        g.drawString("20",30,155);
        g.drawString("0",36,175);
        g.drawLine(50,170,135,170);
        g.drawString("Valerie",200,75);
        g.drawString("Jeroen",200,100);
        g.drawString("Hans",200,125);
        g.setColor(Color.green);
        g.fillRect(250,65,10,10);
        g.fillRect(60,130,20,40);
        g.setColor(Color.red);
        g.fillRect(250,90,10,10);
        g.fillRect(85,70,20,100);
        g.setColor(Color.blue);
        g.fillRect(250,115,10,10);
        g.fillRect(110,90,20,80);

    }
}
