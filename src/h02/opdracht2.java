package h02;
//v1: Machinetaal is een taal waarin intsructies geschreven om een proces outvoeren
//v2: java, programma's zoals intel, een computer
//v3: leesbare text door de programeur geschreven
//v4: zodat de programma weet waruit het sommige onderdelen vandaan moet halen
//v5: wat en hoe je iets doet?

import java.awt.*;
import java.applet.*;
public class opdracht2 extends Applet{

    public void init(){
        setBackground(Color.blue);
    }

    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.drawString("Justin",20,20);
        g.drawString("de Laat",20,40);
    }

}
