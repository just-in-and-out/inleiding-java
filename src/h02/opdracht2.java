package h02;
//v1: Machinetaal is een taal waarin intsructies geschreven om een proces outvoeren
//v2: java, programma's zoals intel, een computer
//v3:
//v4:
import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Justin", 50, 60 );
        g.drawString("de Laat", 50, 100);
    }


}