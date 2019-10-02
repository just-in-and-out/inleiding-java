package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    private int amount = 0;
    double[] numbers;
    double copy;
    String converter;
    TextField textField1;
    TextField textField2;
    TextField textField3;
    TextField textField4;
    TextField textField5;

    public void init() {

        textField1 = new TextField(5);
        add(textField1);

        textField2 = new TextField(5);
        add(textField2);

        textField3 = new TextField(5);
        add(textField3);

        textField4 = new TextField(5);
        add(textField4);

        textField5 = new TextField(5);
        add(textField5);

        Button OK = new Button("ENTER");
        OK.addActionListener(new Oklisetener());
        add(OK);

    }

    public void paint(Graphics g) {

    }

    static class Oklisetener implements ActionListener{

        public void actionPerformed(ActionEvent e) {



        }
    }
}
