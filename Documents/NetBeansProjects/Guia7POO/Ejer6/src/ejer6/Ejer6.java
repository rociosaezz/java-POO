package ejer6;

import Entidades.Cafetera;
import Service.ServiceCafetera;
import java.util.Scanner;

public class Ejer6 {

    public static void main(String[] args) {
        ServiceCafetera C1 = new ServiceCafetera();
        Cafetera nespresso = C1.llenarCafetera();
C1.menu(nespresso);
    }   
}
