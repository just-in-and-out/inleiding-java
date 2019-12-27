package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    public TextField[] textFields;

    private int teller = 0;
    int middle = 0;
    int numbers;
    public String converter;

    public void init() {

        Button OK = new Button("OK");
        OK.addActionListener(new Oklisetener());

        add(OK);
        converter = " ";

        while (teller < 5){

            textFields[teller] = new TextField();
            add(textFields[teller]);
            teller++;

        }
    }

    public void paint(Graphics g) {

        g.drawString(" " + middle,20,20);

    }

    class Oklisetener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            converter = textFields[teller].getText();
            numbers = Integer.parseInt(converter);
            repaint();
        }
    }
}
