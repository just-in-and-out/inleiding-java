package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht5 extends Applet {

    double getalinput;
    double getaloutput;
    TextField textfield;
    String converter;
    Button ok;
    double getaloutput2;
    String VaNV;

    public void init() {

        setSize(600,400);

        textfield = new TextField(10);
        add(textfield);

        ok = new Button("OK");
        ok.addActionListener(new oklistener());
        add(ok);

    }

    public void paint(Graphics g) {

        g.drawString(" " + getaloutput,250,40);
        g.drawString(" " + VaNV,250,60);

    }

    class oklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String converter = textfield.getText();
            getalinput = Double.parseDouble( converter);

            if (getaloutput == 0){

                getaloutput = getalinput;
                repaint();

            }

            if (getaloutput > 0){

                getaloutput = getalinput + getaloutput / 2;
                repaint();

            }

            if (getaloutput >= 5.5){

                VaNV = "voldoende";
                repaint();

            }

            if (getaloutput < 5.5){

                VaNV = "onvoldoende";
                repaint();

            }
        }
    }
}
