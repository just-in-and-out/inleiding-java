package h04;
//v1: een combinatie van een processor en een besturingssysteem
//v2: java vertaald het naar een tussentaal die standaard is
//v3: de tussentaal /\
//v4: JVM zorgt ervoor dat je applets kan gebruiken
//v5: drawRect(X,Y,n,n)
//v6: drawAng (X,Y,n,n,S.A,360) / drawOval (X,Y,n,n) / drawRoundRect (X,Y,n,n,n,n)
//v7: anders werk het niet(even goed)?

import java.awt.*;
import java.applet.*;

public class opdracht7 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){

        g.drawRoundRect(50,50,100,100,25,25);
        g.fillOval(65,65,15,15);
        g.fillOval(120,65,15,15);
        g.fillOval(65,120,15,15);
        g.fillOval(120,120,15,15);

    }
}
