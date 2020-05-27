package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class opdracht3 extends Applet {

    public TextField[] textFields;

    private int teller = 0;
    public String converter[];
    int numbers[];
    int counter = 0;

    public void init() {

        converter = new String[5];
        numbers = new int[5];

        Button OK = new Button("OK");
        OK.addActionListener(new Oklisetener());
        add(OK);

        textFields = new TextField[5];

        while (teller < 5){



            textFields[teller] = new TextField();
            add(textFields[teller]);
            teller++;
        }
    }

    public void paint(Graphics g) {


    }

    class Oklisetener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (counter = 0; counter < 5;counter++){
                converter[counter] = textFields[counter].getText();
                numbers[counter] = Integer.parseInt(converter[counter]);
            }
            Arrays.sort(numbers);
            for (int x = 0;x < 5; x++){
                converter[x] = String.valueOf(numbers[x]);
                textFields[x].setText(converter[x]);
                repaint();
            }
        }
    }
}
