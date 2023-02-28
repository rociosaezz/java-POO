/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario.
 */
package Service;

import Entidades.Pais;
import java.util.HashSet;
import java.util.Scanner;
public class ServicePais {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Pais crearPais(HashSet paises){
        System.out.println("Ingrese el nombre del país que desea agregar: ");
        String pais=leer.next();
        return new Pais(pais);
    }
    
    public void llenarPaises(HashSet paises){
        System.out.println("--- Bienvenido a la lista de países ---");
        String option;
        do{
        System.out.println("¿Desea agregar un nuevo país? s/n");
        option = leer.next();
        
        
           while (option.equalsIgnoreCase("n")){
               mostrarPaises(paises);
               System.out.println("Gracias por utilizar este programa");
               break;
           }
            while(!option.equalsIgnoreCase("s") || option.equalsIgnoreCase("n")){
            
            System.out.println("Opción inválida. Ingrese s o n");
            option = leer.next();
            break;
        }  
        paises.add(crearPais(paises));
    }while (option.equalsIgnoreCase("s"));
    
        
}
    public void mostrarPaises(HashSet paises){
        for (int i = 0; i < 10; i++) {
            
        }
        
        });
    }
}
