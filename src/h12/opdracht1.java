package h12;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {
    double[] salaris;
    double total;

    public void init() {
        setSize(600,400);
        salaris = new double[9];

        for (int teller = 0; teller < 9; teller++){

            salaris[teller] = 25 * (teller + 1);

            total = salaris[teller] / 2;
        }


    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString(" " + salaris[teller], 100, 20 + 20 * teller);
            g.drawString(" " + total, 200, 50);
        }
    }
}
