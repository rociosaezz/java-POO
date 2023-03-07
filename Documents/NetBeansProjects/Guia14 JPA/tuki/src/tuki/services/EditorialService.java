package tuki.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tuki.entidades.Editorial;
import tuki.persistences.ControladoraPersistencia;

public class EditorialService {

    ArrayList<Editorial> editoriales = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Editorial crearEditorial(String a) {
        Editorial ed = new Editorial();
        ed.setAlta(true);
        ed.setNombre(a.toLowerCase());
        controlPersis.crearEditorial(ed);
        editoriales.add(ed);
        System.out.println("Editorial " + a.toUpperCase() + " creada con éxito.");
        return ed;
    }

    public List<Editorial> mostrarEditoriales() {
        return controlPersis.mostrarEditoriales();
    }

    public Editorial elegirEditorial() {
        System.out.println("Las editoriales disponibles son: " + mostrarEditoriales().toString());
        System.out.println("¿Cuál desea elegir? Ingrese el ID de la editorial como figura en el listado en pantalla: ");
        int ed = leer.nextInt();
        if (controlPersis.buscarEditorial(ed)==null) {
            System.out.println("La editorial indicada no se ha encontrado en la lista. Cree una nueva: ");
            crearEditorial(leer.next());
        }
        return controlPersis.buscarEditorial(ed);
    }

    public void editarEditorial() {
        System.out.println("¿Qué editorial desea modificar? \n" + mostrarEditoriales().toString());
        System.out.println("Ingrese el ID de la editorial que desea modificar, tal como sale en el listado: ");
        int edSelec = leer.nextInt();
        Editorial edi;
        try {
            edi = controlPersis.buscarEditorial(edSelec);
            System.out.println("Ingrese el nuevo nombre a colocar: ");
            edi.setNombre(leer.next());
            controlPersis.editarEditorial(edi);
        } catch (Exception ex) {
            ex.getMessage();
            System.out.println("No se ha encontrado una editorial con ese ID.");
        }
    }

    public void eliminarEditorial() {
        System.out.println("¿Qué editorial desea eliminar?\n"+ mostrarEditoriales().toString());
        System.out.println("Ingrese el Id de la editorial tal como sale en el listado: ");
        int edSelec = leer.nextInt();
               for (Editorial edit : editoriales) {   
            if (edSelec == edit.getId()) {
                editoriales.remove(edit);
                System.out.println("La editorial a eliminar es: " + edit.getNombre().toUpperCase());
            }            }
               
           controlPersis.eliminarEditorial(edSelec);
            System.out.println("Editorial eliminada con éxito.");
    }
}