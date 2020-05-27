package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht6 extends Applet {

    public int[] numbers;
    Button Submit;
    TextField input;
    String converter;
    int wanted;
    int count = 0;
    String message = "type a number from 1 to 10 to see how many times it's in this applet.";
    int teller;
    String output = " ";

    public void init() {

        numbers = new int[]{1,1,1,1,1,2,2,2,2,2,2,2,3,3,4,4,4,4,5,5,5,5,6,6,7,8,8,8,9,9,9,10,10,10,10};

        Submit = new Button("Submit");
        Submit.addActionListener(new Submitlistener());
        add(Submit);

        input = new TextField(5);
        add(input);

        System.out.println(numbers[3]);
    }

    public void paint(Graphics g) {

        g.drawString("" + message, 50 , 50);


    }

    class Submitlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            converter = input.getText();
            wanted = Integer.parseInt(converter);
            count = 0;
            teller = 0;
            output = converter;

            while (teller < numbers.length){
                if (wanted == numbers[teller]){
                    count++;
                }
                teller++;
            }
            if (count == 0){
                message = "you have chosen an number that is outside the range of 1 to 10. please pick a new number and try again";
            }
            else{
                message = "the number "+ wanted +" shows up "+ count +" times in this applet";
            }
            repaint();
        }
    }
}
