package test;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class test2 extends Applet {

    TextField tekstvak;
    Button knopOK;
    Button knopReset;
    String message;

    public void init() {

        setSize(400,400);

        tekstvak = new TextField(20);
        add(tekstvak);

        knopOK = new Button("OK");
        knopOK.addActionListener(new KnopOKListener());
        add(knopOK);

        knopReset = new Button("Reset");
        knopReset.addActionListener(new KnopResetListener());
        add(knopReset);

        message = "type here to put it on the screen";

    }

    public void paint(Graphics g) {

        g.drawString(message,60,100);

    }

    class KnopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            message = tekstvak.getText();
            repaint();

        }
    }

    class KnopResetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            tekstvak.setText("");
            message = "type here to put it on the screen";
            repaint();

        }

    }
}