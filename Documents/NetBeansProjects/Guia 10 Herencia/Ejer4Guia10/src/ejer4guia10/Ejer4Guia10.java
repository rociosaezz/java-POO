package ejer4guia10;

import ejer4guia10.Entidades.Circulo;
import ejer4guia10.Entidades.Rectangulo;

/**Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2. */
public class Ejer4Guia10 {

    public static void main(String[] args) {
        System.out.println("Circulo 1");
        Circulo c1 = new Circulo(5.2);
        c1.calcularArea();
        c1.perimetro();
        System.out.println("Circulo 2");
        Circulo c2 = new Circulo(6.8);
        c2.calcularArea();
        c2.perimetro();
        System.out.println("Rectangulo 1");
        Rectangulo r1 = new Rectangulo(4.3, 9.2);
        r1.calcularArea();
        r1.perimetro();
        System.out.println("Rectangulo 2");
        Rectangulo r2 = new Rectangulo(3.0, 2.0);
        r2.calcularArea();
        r2.perimetro();
    }
    
}
