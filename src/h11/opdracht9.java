package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht9 extends Applet {

    public void init() {

        setBackground(Color.gray);

    }

    public void paint(Graphics g) {

        int breedte = 20;
        int hoogte = 20;
        int x = 50;
        int y = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4|| kolom == 6){

                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
                g.fillRect(x, y+40, breedte, hoogte);
                g.fillRect(x, y+80, breedte, hoogte);
                g.fillRect(x, y+120, breedte, hoogte);

            }
            else {

                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
                g.fillRect(x, y+40, breedte, hoogte);
                g.fillRect(x, y+80, breedte, hoogte);
                g.fillRect(x, y+120, breedte, hoogte);

            }
            x += breedte;

        }
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
                g.fillRect(x, y+40, breedte, hoogte);
                g.fillRect(x, y+80, breedte, hoogte);
                g.fillRect(x, y+120, breedte, hoogte);

            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
                g.fillRect(x, y+40, breedte, hoogte);
                g.fillRect(x, y+80, breedte, hoogte);
                g.fillRect(x, y+120, breedte, hoogte);

            }
            x += breedte;
        }
    }
}
