package h09;

import java.applet.Applet;
import java.awt.*;

public class theory extends Applet {


    public void init() {

    }

    public void paint(Graphics g){

        g.drawString("Als het programma start, wordt allereerst init() aangeroepen. Daarin kunnen bijvoorbeeld de venstereigenschappen staan van het hoofdvenster zoals de achtergrondkleur. Verder wordt aan Windows doorgegeven welke \"kindvensters\"",20,20);
        g.drawString("er getekend moeten worden, bijvoorbeeld de knoppen en tekstvakken met labels. Als de vensters door Windows getekend zijn kan de inhoud door het programma worden weergegeven.",20,40);
        g.drawString("Dan kan Windows wachten totdat de gebruiker iets doet. In dit geval drukt de gebruiker op de entertoets. Hij had ook op een knop kunnen klikken. Windows geeft de gebeurtenis door aan het programma die daar vervolgens iets mee doet.",20,60);
        g.drawString("Vervolgens vertelt repaint() aan Windows dat de vensters opnieuw getekend moeten worden en vertelt Windows, zodra de vensters getekend zijn, dat de inhoud in de vensters kan worden weergegeven. Tot slot wordt er gewacht op de volgende gebeurtenis.",20,80);



    }
}