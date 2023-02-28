package ejer2guia10;

import ejer2guia10.Entidades.Electrodomestico;
import ejer2guia10.Entidades.Lavadora;
import ejer2guia10.Entidades.Televisor;
import java.util.ArrayList;

public class Ejer2Guia10 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> le = new ArrayList();
        Lavadora lava1 = new Lavadora(6, 0, "blanco", 'G', 85.5);
        le.add(lava1);
        Lavadora lava2 = new Lavadora(8, 0, "gris", 'A', 75.2);
        le.add(lava2);
        Televisor TV1 = new Televisor(39, false, 0, "rosa", 'B', 35.5);
        le.add(TV1);
        Televisor TV2 = new Televisor(55, true, 0, "negro", 'A', 56.3);
        le.add(TV2);
        for (Electrodomestico elec : le) {
            elec.precioFinal(elec);
            System.out.println(elec.toString());
        }
    }

}
