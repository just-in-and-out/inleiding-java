package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht extends Applet {

    int number = 0;
    int card = 0;
    String message1;
    String message2;

    public void init() {

        Button draw_card = new Button("draw card");
        draw_card.addActionListener(new cardlistener());
        add(draw_card);

    }

    public void paint(Graphics g) {

        g.drawString(message1,125,50);
        g.drawString(message2,75,50);

    }

    class cardlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            double number_generator1 = Math.random();
            number = (int) (number_generator1 * 10 + 1);
            double number_generator2 = Math.random();
            card = (int) (number_generator2 * 10);


            if(number ==1){

                message1 = "one";

            }
            if(number ==2){

                message1 = "two";

            }
            if(number ==3){

                message1 = "three";

            }
            if(number ==4){

                message1 = "four";

            }
            if(number ==5){

                message1 = "five";

            }
            if(number ==6){

                message1 = "six";

            }
            if(number ==7){

                message1 = "seven";

            }
            if(number ==8) {

                message1 = "eight";

            }
            if(number ==9){

                message1 = "nine";

            }

            if(number ==10){



                double number_generator3 = Math.random();
                int number2 = (int) (number_generator3 * 10);
                if(number2 == 0/1/2/3){

                    message1 = "ten";
                    repaint();
                }
                if (number2 == 4/5/6) {

                message1 = "Jack";
                }
                if (number2 == 7/8) {

                message1 = "Queen";

                }
                if (number2 == 9/10) {

                message1 = "King";

                }

            }
            if (card ==  0/1/2){
                message2 = "hearts";
            }
            if (card == 3/4/5){
                message2 = "diamond";
            }
            if (card == 6/7/8){
                message2 = "clover";
            }
            if (card == 9/10);{
                message2 = "spades";
            }
            repaint();
        }
    }
}
