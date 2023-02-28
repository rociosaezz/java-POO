package ejer4guia10.Entidades;

import ejer4guia10.calculosFormas;
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
public class Circulo implements calculosFormas {
private Double radio;

    

    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        Double area=  (radio*radio) * PI;
        System.out.println("El area del circulo es: "+area);
          }

    @Override
    public void perimetro() {
        Double perimetro= PI*(radio*2);
        System.out.println("El perimetro del círculo es: "+perimetro);
      }
    
    
}
