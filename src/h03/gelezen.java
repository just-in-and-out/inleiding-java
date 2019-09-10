package h03;

import java.awt.*;
import java.applet.*;

public class gelezen extends Applet{

    public void init(){

    }

    public void paint(Graphics g){

        g.drawString("Een applicatie is een programma dat buiten de webbrowser of buiten een appletviewer kan worden uitgevoerd. Dit geldt voor alle applicaties in welke programmeertaal dan ook geschreven. Een applicatie geschreven in Java, heeft wel JVM (Java Virtual Machine)",20,20);
        g.drawString("nodig om uitgevoerd te kunnen worden. Een applet kan alleen in een webbrowser of appletviewer uitgevoerd worden. Een applet is namelijk altijd een onderdeel van webpagina.",20,40);
        g.drawString("Elke processor (bijvoorbeeld die van Intel, Motorola of SPARC) heeft zijn eigen machinetaal. Daarnaast heeft elke computer ook een besturingssysteem die ook eigen eisen stelt aan programma's. Die combinatie van een processor en een besturingssysteem noemen we een platform.",20,60);
        g.drawString("In Java wordt de broncode vertaald naar een tussentaal die standaard is. Deze tussentaal wordt Bytecode genoemd. Vervolgens vertaalt de JVM tijdens de uitvoering de applicatie of de applet de bytecode in machinetaal voor het betreffende platform. ",20,80);
        g.drawString("Wel moet het besturingssysteem over een JVM beschikken. De verschillen tussen bytecode enerzijds en de verschillende machinetalen anderzijds zijn zo klein, dat een gebruiker daarvan nauwelijks of niets merkt.",20,100);
        g.drawString("Er is nog een verschil tussen een applet en een applicatie: Een applicatie kan gegevens uit bestanden lezen, gegevens naar bestanden schrijven en bestanden maken of verwijderen. Uit veiligheidsoverwegingen kan een applet dat niet. Een applet draait op de client en dus op zeer veel verschillende computers en zou veel schade kunnen aanrichten, als het met bestanden kan omgaan.",20,120);

    }
}
