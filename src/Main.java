import Motherboard.Motherboard;
import PSU.PSU;
import Processor.Processor;
import RAM.RAM;
import graphicCard.GraphicCard;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        GraphicCard AMDRADEON660RX = new GraphicCard("AMD Radeon","6650RX","128",8,"GDDR6",680.2);
        AMDRADEON660RX.addPorts("HDMI 2.1");
        AMDRADEON660RX.addPorts("HDMI 2.1");
        AMDRADEON660RX.addPorts("DisplayPort 1.4a");
        AMDRADEON660RX.addPorts("DisplayPort 1.4a");
        Processor AMD5500 = new Processor("AMD 5500",3.26,4.21,"AM4",12,16,352.1);
        Motherboard ASUSTUFGAMINGB450M = new Motherboard("ASUS","AMD","AM4","AMD B450",4,199);
        RAM CorsairVengeance = new RAM("3200MHzCorsair Vengeance",8,"DDR4",3200,99);
        PSU AeroCool = new PSU("Aerocool",600,"Modular","Bronze",new ArrayList<>(),79.99);
        AeroCool.addConnector("ATX (20+4 PIN)");
        AeroCool.addConnector("ATX (20+4 PIN)");
        AeroCool.addConnector("SATA x 4 Molex");
        AeroCool.addConnector("SATA x 4 Molex");
        AeroCool.addConnector("SATA x 4 Molex");
        AeroCool.addConnector("Floppy connector 4+4 Pin ATX/EPS x1 20+4 Pin ATX");
    }
    public static void printPSUConnectors(PSU psu){
        for (String connector: psu.getConnectors()){
            System.out.println(connector);
        }
    }
    public static void printGraphicCardPorts(GraphicCard graphicCard) {
        for (String port : graphicCard.getPorts()) {
            System.out.println(port);
        }
    }
    public static int calculateTotalPrice(int price1, int price2, int price3, int price4, int price5, int price6) {
        return price1 + price2 + price3 + price4 + price5 + price6;
    }

}
