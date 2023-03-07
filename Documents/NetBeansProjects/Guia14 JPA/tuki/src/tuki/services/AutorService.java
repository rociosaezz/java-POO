
package tuki.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tuki.entidades.Autor;
import tuki.persistences.ControladoraPersistencia;

public class AutorService {

    ArrayList<Autor> autores = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Autor crearAutor(String a) {
        Autor au = new Autor();
        au.setAlta(true);
        au.setNombre(a.toLowerCase());
        controlPersis.crearAutor(au);
        autores.add(au);
        System.out.println("Autor " + a + " creado con éxito.");
        return au;
    }

    public List<Autor> mostrarAutores() {
        return controlPersis.mostrarAutores();
    }

    public Autor elegirAutor() {
        System.out.println("Los autores disponibles son: " + mostrarAutores().toString());
        System.out.println("¿Cuál desea elegir? Ingrese el ID como figura en el listado en pantalla: ");
        int au = leer.nextInt();
        if (controlPersis.buscarAutor(au) == null) {
            System.out.println("El autor no se ha encontrado en la lista. Cree uno nuevo: ");
            crearAutor(leer.next());
            controlPersis.buscarAutor(au);
        }
        return controlPersis.buscarAutor(au);
    }

    public void editarAutor() {
        System.out.println("¿Qué autor desea modificar? \n" + mostrarAutores().toString());
        System.out.println("Ingrese el ID del autor que desea modificar, tal como sale en el listado: ");
        int auSelec = leer.nextInt();
        Autor aux;
        try {            
            aux = controlPersis.buscarAutor(auSelec);
            System.out.println("Ingrese el nuevo nombre a colocar: ");
            aux.setNombre(leer.next());
            controlPersis.editarAutor(aux);
        } catch (Exception e) {
            System.out.println("No se ha encontrado un autor con ese ID.");            
        }
    }

    public void eliminarAutor() {
        System.out.println("¿Qué autor desea eliminar?\n" + mostrarAutores().toString());
        System.out.println("Ingrese el Id del autor tal como sale en el listado: ");
        int auSelec = leer.nextInt();
        for (Autor au : autores) {        
            if (auSelec == au.getId()) {
                autores.remove(au);
                System.out.println("El autor a eliminar es: " + au.getNombre().toUpperCase());
            }
        }        
        controlPersis.eliminarAutor(auSelec);
        System.out.println("Autor eliminado con éxito.");
    }

}
