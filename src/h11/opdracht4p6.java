package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht4p6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int counter = 9216;
        int y = 0;
        int number1;
        int number2;
        int x = 20;

        while (counter <=10000000){

            y += 10;
            number1 = 3;
            number2 = counter*number1;

            g.drawString("" + counter + " X " + number1 + " = " + number2,x,y);

            counter++;

            if (y == 970){

                y = 0;

                if (counter >= 10000){

                    x +=110;

                }
                else {

                    x += 100;

                }
            }
        }
    }
}

