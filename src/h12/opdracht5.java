package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht5 extends Applet {

    int index[];
    Button Button;
    TextField Text;
    String converter;
    int input;
    int teller = 0;
    int counter = 0;
    String messige = "enter a number";

    public void init() {

        index = new int[20];
        Button = new Button("OK");
        Button.addActionListener(new Buttonlistener());
        add(Button);

        Text = new TextField(5);
        add(Text);

        for (int teller = 0; teller < 20; teller++){
            index[teller] = (teller + 1)*2;
        }
    }
    public void paint(Graphics g){
        g.drawString(" "+messige,250,250);
    }
    class Buttonlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller = 0;
            converter = Text.getText();
            input = Integer.parseInt(converter);
            while (teller < 20) {
                if (input == index[teller]) {
                    messige = " " + (teller * 2 + 2) + " = [" + teller + "]";
                    teller = 20;
                }
                else {
                    messige = "cant find the number in our index.";
                }
                teller++;
            }
            repaint();
        }
    }
}
