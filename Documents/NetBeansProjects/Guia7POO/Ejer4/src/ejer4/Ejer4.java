
package ejer4;

import Entidades.Rectángulo;
import Service.RectanguloService;

public class Ejer4 {

    public static void main(String[] args) {
        RectanguloService R1 = new RectanguloService();
        Rectángulo dibujar = R1.crearRectangulo();
        System.out.println("El perímetro es: " + R1.perimetro(dibujar, dibujar));
        System.out.println("La superficie es: " + R1.superficie(dibujar, dibujar));
        R1.dibujarRectangulo(dibujar, dibujar);
        
        
        
    }
    
}
