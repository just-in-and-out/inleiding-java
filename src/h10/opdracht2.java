package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {

    double getalinput;
    double getalhoogst;
    double getallaagst;
    double getallaagsts;
    TextField textvak;
    Button enter;
    Button reset;
    Button fullreset;
    String textnumbermixer;
    String messageH;
    String messageL;

    public void init() {

        setSize(600,400);

        enter = new Button("enter");
        enter.addActionListener(new enterlistener());
        add(enter);

        reset = new Button("reset");
        reset.addActionListener(new resetlistener());
        add(reset);

        fullreset = new Button("full reset");
        fullreset.addActionListener(new fullresetlistener());
        add(fullreset);

        textvak = new TextField(5);
        add(textvak);

        messageH = "biggest number is: " + getalhoogst;
        messageL = "smallest number is: " + getallaagst;

    }


    public void paint(Graphics g) {

        g.drawString("full reset gets rid of the max and min number!",200,40);
        g.drawString("the biggest number you put in is: " + getalhoogst,190,80);
        g.drawString("the smallest number you put in is: " + getallaagst,185,100);

    }

    class enterlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String textnumbermixer = textvak.getText();
            getalinput = Integer.parseInt( textnumbermixer );
            textvak.getText();
            if (getalinput > getalhoogst) {

                getalhoogst = getalinput;
                repaint();

            }
            if (getalinput < getallaagsts) {

                getallaagst = getalinput;
                getallaagsts = getalinput;
                repaint();

            }
            if (getalinput == 0){
                getallaagsts = 0.1;
                getallaagst = 0;
                repaint();

            }
            else if (getallaagsts == 0){

                getallaagst = getalinput;
                getallaagsts = getalinput;
                repaint();

            }
            messageH = "biggest number is: " + getalhoogst;
            messageL = "smallest number is: " + getallaagst;
            repaint();

        }
    }

    class resetlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            textvak.setText(" ");

        }
    }

    class fullresetlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            textvak.setText(" ");
            getalhoogst = 0;
            getallaagst = 0;
            getallaagsts = 0;
            repaint();

        }
    }
}

