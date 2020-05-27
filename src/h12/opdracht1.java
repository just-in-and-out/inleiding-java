package h12;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    double[] getallen = {1,2,3,4,5,6,7,8,9,10};
    double totaal, gemiddelde;

    public void init(){

        totaal = 0;
        for (int i = 0; i < getallen.length; i++) {
            totaal += getallen[i];
        }
        System.out.println(totaal);
        gemiddelde = totaal / getallen.length;
    }
    public void paint(Graphics g) {
        for (int i = 0; i < getallen.length; i++) {
            g.drawString(" "+ getallen[i],50,25*i+10);
            g.drawString(" " + gemiddelde,100,110);
        }
    }
}
