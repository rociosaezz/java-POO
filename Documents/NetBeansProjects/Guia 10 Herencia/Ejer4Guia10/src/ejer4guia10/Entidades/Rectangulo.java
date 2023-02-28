package ejer4guia10.Entidades;

import ejer4guia10.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Rectangulo implements calculosFormas {
private Double base;
private Double altura;
        
    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        Double area= base*altura;
        System.out.println("El area es:"+area);
       }

    @Override
    public void perimetro() {
        Double perimetro = (base+altura)*2;
        System.out.println("El perímetro es: "+perimetro);
        }
    
}
