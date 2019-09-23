package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    int getalinput;
    TextField textfield;
    String message;
    String converter;
    Button enter;
    Button reset;
    int days;
    String maand;
    String error;

    public void init() {

        setSize(600,400);

        textfield = new TextField(10);
        add(textfield);

        enter = new Button("enter");
        enter.addActionListener(new enterlistener());
        add(enter);

        reset = new Button("reset");
        reset.addActionListener(new resetlistener());
        add(reset);

    }

    public void paint(Graphics g) {


        g.drawString(maand + " has " + days + " number of days.",200,40);
        message = " " + maand + " has " + days + " number of days.";
        g.drawString(error ,200,60);
        error = " ";
        maand = "no input";
        days = 0;

    }

    class enterlistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {


            String converter = textfield.getText();
            getalinput = Integer.parseInt( converter );

            if (getalinput == 1){

                maand = "january";
                days = 31;
                repaint();

            }
            if (getalinput == 2){

                maand = "february";
                days = 28;
                repaint();

            }
            if (getalinput == 3){

                maand = "march";
                days = 31;
                repaint();

            }
            if (getalinput == 4){

                maand = "april";
                days = 30;
                repaint();

            }
            if (getalinput == 5){

                maand = "may";
                days = 31;
                repaint();

            }
            if (getalinput == 6){

                maand = "june";
                days = 30;
                repaint();

            }
            if (getalinput == 7){

                maand = "july";
                days = 31;
                repaint();

            }
            if (getalinput == 8){

                maand = "august";
                days = 31;
                repaint();

            }
            if (getalinput == 9){

                maand = "september";
                days = 30;
                repaint();

            }
            if (getalinput == 10){

                maand = "october";
                days = 31;
                repaint();

            }
            if (getalinput == 11){

                maand = "november";
                days = 30;
                repaint();

            }
            if ((getalinput == 12)){

                maand = "december";
                days = 31;
                repaint();

            }
            if (getalinput >12){

                maand = "bad input";
                error = "error. no month connected to number";
                repaint();

            }
            if (getalinput <1){

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
            textfield.setText(" ");
            repaint();

        }
    }

}
