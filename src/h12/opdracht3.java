package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    TextField textFields1;

    private int teller = 0;

    public void init() {

        Button OK = new Button("OK");
        OK.addActionListener(new Oklisetener());
        add(OK);

        while (teller < 5){

            textFields1 = new TextField();
            add(textFields1);

            teller++;

        }
    }

    public void paint(Graphics g) {

        g.drawString(" " + teller,20,20);

    }

    static class Oklisetener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        }
    }
}
