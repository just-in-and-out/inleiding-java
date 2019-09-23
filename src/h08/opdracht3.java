package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    double getal1;
    double getalinput;
    TextField textvlak;
    Button enter;
    Button reset;
    String message;
    String number;

    public void init() {

        setSize(600,400);

        textvlak = new TextField(20);
        add(textvlak);



        enter = new Button("Enter");
        enter.addActionListener(new enterListener());
        add(enter);

        reset = new Button("Reset");
        reset.addActionListener(new resetListener());
        add(reset);

        message = ("total: "+getal1);

    }


    public void paint(Graphics g) {

        g.drawString("total: " +getal1,300,50);

    }

    class enterListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String message = textvlak.getText();
            getalinput = Double.parseDouble( message );
            textvlak.getText();
            getal1 = getalinput*1.21;
            message = ("total: "+getal1);
            repaint();
        }
    }

    class resetListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            textvlak.setText(" ");
            message = "total: "+getal1;
            repaint();

        }
    }
}
