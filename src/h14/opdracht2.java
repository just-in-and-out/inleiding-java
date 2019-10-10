package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class opdracht2 extends Applet {

    private String deelKaart() {
        String[] deck = new String[99];
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void init() {

        Button deel_kaarten = new Button("deel kaarten");
        deel_kaarten.addActionListener(new buttonlistener());
        add(deel_kaarten);

    }

    public void paint(Graphics g) {

        deelKaart();
    }

    class buttonlistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            deelKaart();

        }
    }
}