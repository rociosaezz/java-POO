/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

ejer2
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ServiceRazas;
import RazasPerros.Razas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceRaza {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Razas crearPerro(ArrayList <String> razasPerros) {
        System.out.println("Ingrese la raza de su perro:");
        String raza = leer.next();
        return new Razas(raza);
    }

    public void llenarRazas(ArrayList <String> razasPerros) {
        String option = "s";
        do {
            Razas perroNuevo = crearPerro(razasPerros);
            do {
                System.out.println("¿Desea agregar otro perro? s/n");
                option = leer.next();

            } while (!(option.equalsIgnoreCase("s") || (option.equalsIgnoreCase("n"))));
            if (option.equalsIgnoreCase("n")) {
                System.out.println("Razas agregadas: ");
                
            }            
            razasPerros.add(perroNuevo.getRaza().toLowerCase());
        } while(option.equalsIgnoreCase("s"));  }
    
    public void mostrarRazas(ArrayList <String> razasPerros){
        for (String razasPerro : razasPerros) {
            System.out.println(razasPerro);
        }
    }
    /* al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
public void buscarPerro(ArrayList <String> razasPerros){
    System.out.println("Ingrese la raza de perros que desea eliminar: ");
    String eliminar = leer.next();
    boolean encontro= false;
    Iterator <String> it = razasPerros.iterator();
    while(it.hasNext()){
        if (it.next().equalsIgnoreCase(eliminar)) {
            encontro = true;
            it.remove();
        }
    }
    if (encontro==true) {
         System.out.println("Se ha encontrado el perro "+ eliminar+ ", se eliminará de la lista.");
    
    }else if (!encontro) {
        
         System.out.println("No se ha encontrado el perro "+ eliminar + " en la lista.");
          
    }
    
} 
public void ordenarRazas(ArrayList <String> razasPerros){
    Collections.sort(razasPerros);   
    
}
}

    

