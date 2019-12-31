
package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class opdracht3 extends Applet {

    public TextField[] textFields;

    private int teller = 0;
    int middle = 0;
    int number;
    public String converter;
    int numbers[];
    int counter = 0;

    public void init() {

        Button OK = new Button("OK");
        OK.addActionListener(new Oklisetener());

        textFields = new TextField[5];

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

        g.drawString(" "+ numbers[counter],50,50);

    }

    class Oklisetener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (counter = 0; counter < 5;counter++){
                converter = textFields[counter].getText();
                numbers[counter] = Integer.parseInt(converter);
                repaint();
            }
            Arrays.sort(numbers);
        }
    }
}