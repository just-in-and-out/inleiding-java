package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1 extends Applet {

    double getalinput;
    double getalhoogst;
    TextField textvak;
    Button enter;
    Button reset;
    Button fullreset;
    String textnumbermixer;
    String message;

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

        message = "biggest number is:" + getalhoogst;

    }


    public void paint(Graphics g) {

        g.drawString("full reset gets rid of the max number!",200,40);
        g.drawString("the biggest number you put in is: " + getalhoogst,190,80);

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
            message = "biggest number is:" + getalhoogst;
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
            repaint();

        }
    }
}
