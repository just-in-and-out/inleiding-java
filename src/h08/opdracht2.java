package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {

    Button Vrouw;
    Button Man;
    Button Jonge;
    Button Meisje;
    int getalV;
    int getalM;
    int getalj;
    int getalm;

    public void init() {
        setSize(600,400);

        Vrouw = new Button("Vrouw");
        Vrouw.addActionListener(new ButtonVrouwListener());
        add(Vrouw);

        Man = new Button("Man");
        Man.addActionListener(new ButtonManListener());
        add(Man);

        Jonge = new Button("Jonge");
        Jonge.addActionListener(new ButtonJongeListener());
        add(Jonge);

        Meisje = new Button("Meisje");
        Meisje.addActionListener(new ButtonMeisjeListener());
        add(Meisje);

    }


    public void paint(Graphics g) {

        g.drawString("vrouwen: " + getalV, 225,40);
        g.drawString("Mannen: " + getalM, 325,40);
        g.drawString("Jongens: " +getalj, 325,60);
        g.drawString("meisjes: " +getalm, 225,60);

    }

    class ButtonVrouwListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {

            getalV = getalV+1;
            repaint();

        }
    }

    class ButtonManListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {

            getalM = getalM+1;
            repaint();

        }
    }

    class ButtonJongeListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            getalj = getalj+1;
            repaint();

        }
    }

    class ButtonMeisjeListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            getalm = getalm+1;
            repaint();

        }
    }
}
