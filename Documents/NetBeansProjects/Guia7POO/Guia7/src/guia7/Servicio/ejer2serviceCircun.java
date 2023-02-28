
package guia7.Servicio;

import guia7.ejer2Circunferencia;
import java.util.Scanner;

public class ejer2serviceCircun {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ejer2Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio");
        double circulo = leer.nextDouble();
        return new ejer2Circunferencia(circulo);
    }
    public double Area(ejer2Circunferencia circulo){
        double area;
        area = Math.PI * Math.pow(circulo.getRadio(),2);
        return area;
    }
    public double Perimetro(ejer2Circunferencia circulo){
        double perimetro;
        perimetro = 2* Math.PI * circulo.getRadio();        
        return perimetro;
    
}
    
}


