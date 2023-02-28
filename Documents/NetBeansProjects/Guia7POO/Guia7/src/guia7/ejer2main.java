
package guia7;

import guia7.Servicio.ejer2serviceCircun;
public class ejer2main {

    public static void main(String[] args) {
        ejer2serviceCircun C1 = new ejer2serviceCircun();
        ejer2Circunferencia circulo = C1.crearCircunferencia();
        System.out.println("Area: "+C1.Area(circulo));
        System.out.println("Perimetro: "+ C1.Perimetro(circulo));
         }
    
}
