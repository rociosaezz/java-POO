package ejer2guia10.Service;

import ejer2guia10.Entidades.Electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;

public class ElectroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     /* Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
    private void comprobarConsumoEnergetico(char letra,Electrodomestico e){       
        switch (letra){
             case 'A','a':
                e.setConsumoEnergetico(letra);
                break;
            case 'B','b':
                e.setConsumoEnergetico(letra);
                 break;
            case 'C','c':
                e.setConsumoEnergetico(letra);
                 break;
            case 'D','d':
                e.setConsumoEnergetico(letra);
                 break;
            case 'E','e':
                e.setConsumoEnergetico(letra);
                 break;
            case 'F','f':
                e.setConsumoEnergetico(letra);
                 break;
            default:
                e.setConsumoEnergetico('F');
        }
             }
    
    
/*• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
private void comprobarColor(String colorin, Electrodomestico e){
    
          switch (colorin.toLowerCase()){
            case "blanco":
                e.setColor(colorin);
                break;
            case "negro":
                   e.setColor(colorin);
                break;
            case "rojo":
                   e.setColor(colorin);
                break;
            case "azul":
                   e.setColor(colorin);
                break;
            case "gris":
                  e.setColor(colorin);
            default:
                 e.setColor("blanco");
        }}
        */

/*    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000
public void crearElectrodomestico( ArrayList <Electrodomestico> le){
    Electrodomestico e = new Electrodomestico();
    System.out.println("¿Qué electrodoméstico desea?");
    String elige = leer.next();
    System.out.println("Se creará un: "+elige);
    System.out.println("¿Qué consumo energético elige para su electrodoméstico? A-F");
    String letra = leer.next();
    comprobarConsumoEnergetico(letra.charAt(0), e);
    System.out.println("¿De qué color quiere su electrodoméstico?");
    String color = leer.next();
    comprobarColor(color,e);
    System.out.println("¿Cuánto pesa?");
    e.setPeso(leer.nextDouble());
    System.out.println("El precio es de: ");
    e.setPrecio(1000);
    precioFinal(e);
    le.add(e);
    
}
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios
private void precioFinal(Electrodomestico e){
   switch (e.getConsumoEnergetico()) {
            case 'A','a':
                e.setPrecio(e.getPrecio()+1000);
                break;
            case 'B','b':
                e.setPrecio(e.getPrecio()+800);
                break;
            case 'C','c':
                e.setPrecio(e.getPrecio()+600);
                break;
            case 'D','d':
                e.setPrecio(e.getPrecio()+500);
                break;
            case 'E','e':
                e.setPrecio(e.getPrecio()+300);
                break;
            case 'F','f':
                e.setPrecio(e.getPrecio()+100);
                break;
    }
    if (e.getPeso()<19) {
        e.setPrecio(e.getPrecio()+100);
    }
    if (e.getPeso()>19 && e.getPeso()<50) {
        e.setPrecio(e.getPrecio()+500);
            }
   if (e.getPeso()>49 && e.getPeso()<80) {
        e.setPrecio(e.getPrecio()+800);
            } 
   if (e.getPeso()>=80) {
        e.setPrecio(e.getPrecio()+500);
            }
}*/
}
