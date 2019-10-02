package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int teller = 0;
        int y = 0;
        double number1 = 1;
        double number2 = 0;
        double number3;

        while(teller < 100) {

            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;

            y += 10;
            g.drawString("" + number3, 20, y );
            teller++;
        }
    }
}
