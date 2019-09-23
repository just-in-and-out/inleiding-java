package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht4 extends Applet {

    int getalinputM;
    int getalinputJ;
    TextField textfieldM;
    String message;
    String converter;
    Button enter;
    Button reset;
    int days;
    String maand;
    String error;
    int eindgetaljaar;
    String converter2;
    TextField textfieldJ;

    public void init() {

        setSize(600,400);

        textfieldM = new TextField(10);
        add(textfieldM);

        textfieldJ = new TextField(10);
        add(textfieldJ);

        enter = new Button("enter");
        enter.addActionListener(new enterlistener());
        add(enter);

        reset = new Button("reset");
        reset.addActionListener(new resetlistener());
        add(reset);

    }

    public void paint(Graphics g) {

        g.drawString("Jaar",300,60);
        g.drawString("maand",200,60);
        g.drawString(maand + " has " + days + " number of days.",200,40);
        message = " " + maand + " has " + days + " number of days.";
        g.drawString(error ,200,60);
        error = " ";
        maand = "no input";
        days = 0;

    }

    class enterlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String converter2 = textfieldJ.getText();
            String converter = textfieldM.getText();
            getalinputM = Integer.parseInt( converter );
            getalinputJ = Integer.parseInt( converter2);

            if (getalinputM == 1){

                maand = "january";
                days = 31;
                repaint();

            }
            if (getalinputM == 2){

                maand = "february";

                if ((getalinputJ % 4 == 0 && !(getalinputJ % 100 == 0)) || getalinputJ % 400 == 0){

                    days=29;

                }

                else{

                    days = 28;

                }

            }
            if (getalinputM == 3){

                maand = "march";
                days = 31;
                repaint();

            }
            if (getalinputM == 4){

                maand = "april";
                days = 30;
                repaint();

            }
            if (getalinputM == 5){

                maand = "may";
                days = 31;
                repaint();

            }
            if (getalinputM == 6){

                maand = "june";
                days = 30;
                repaint();

            }
            if (getalinputM == 7){

                maand = "july";
                days = 31;
                repaint();

            }
            if (getalinputM == 8){

                maand = "august";
                days = 31;
                repaint();

            }
            if (getalinputM == 9){

                maand = "september";
                days = 30;
                repaint();

            }
            if (getalinputM == 10){

                maand = "october";
                days = 31;
                repaint();

            }
            if (getalinputM == 11){

                maand = "november";
                days = 30;
                repaint();

            }
            if ((getalinputM == 12)){

                maand = "december";
                days = 31;
                repaint();

            }
            if (getalinputM >12){

                maand = "bad input";
                error = "error. no month connected to number";
                repaint();

            }
            if (getalinputM <1){

                maand = "bad input";
                error = "error. no month connected to number";
                repaint();

            }

            repaint();

        }
    }

    class resetlistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            maand = "no input";
            days = 0;
            textfieldM.setText(" ");
            textfieldJ.setText(" ");
            repaint();

        }
    }

}
