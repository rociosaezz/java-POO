/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Generar una clase Main que realice lo
siguiente:*/
package ejer1guia10;

import ejer1guia10.Entidades.Animal;
import ejer1guia10.Entidades.Caballo;
import ejer1guia10.Entidades.Gato;
import ejer1guia10.Entidades.Perro;

/**
 *
 * @author Rocio
 */
public class Ejer1Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Animal perro1 = new Perro("Pipo", "Carnivoro", 10, "Doberman");
   perro1.Alimentarse();
          Animal perro2 = new Perro("Toy", "Solo alimento balanceado", 15, "Caniche");
         perro2.Alimentarse();
          Animal merlincho = new Gato ("Merli", "Carne y pescado", 5,"Europeo atigrado");
          merlincho.Alimentarse();
          Animal pony = new Caballo("Pony", "Herbivoro", 8, "Blanco");
          pony.Alimentarse();
          
    }
    
}
