package libreria.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;

public class EditorialServicio {

    ArrayList<Editorial> editoriales = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

    public Editorial crearEditorial(String a) {
        Editorial ed = new Editorial();
        ed.setAlta(true);
        ed.setId(UUID.randomUUID().clockSequence());
        ed.setNombre(a.toLowerCase());
        em.getTransaction().begin();
        em.persist(ed);
        em.getTransaction().commit();
        editoriales.add(ed);
        System.out.println("Editorial " + a.toUpperCase() + " creada con éxito.");
        return ed;
    }

    public Editorial elegirEditorial() {
        System.out.println("Las editoriales disponibles son: ");
        for (Editorial edi : editoriales) {
            System.out.println(edi.toString());
        }
        System.out.println("¿Cuál desea elegir? Ingrese el nombre completo como figura en el listado en pantalla: ");
        String ed = leer.next();
        Editorial edSelec = null;
        Editorial aux;
        Boolean band = false;
        for (Editorial edi : editoriales) {
            if (ed.equalsIgnoreCase(edi.getNombre())) {
                band = true;
                edSelec = edi;
            }
        }
        if (band == true) {
            System.out.println("Ha seleccionado el autor: " + ed.toUpperCase());
            aux = edSelec;
        } else {
            System.out.println("La editorial " + ed.toUpperCase() + " no se ha encontrado en la lista. Cree una nueva: ");
            aux = crearEditorial(leer.next());
        }

        return aux;
    }

    public void mostrarEditoriales() {
        for (Editorial ed : editoriales) {
            System.out.println(ed.toString());
        }
    }

    public void modificarEditorial() {
        System.out.println("¿Qué editorial desea modificar?");
        mostrarEditoriales();
        System.out.println("Ingrese el Id de la editorial que desea modificar, tal como sale en el listado: ");
        int edSelec = leer.nextInt();
        for (Editorial ed : editoriales) {
            if (edSelec==ed.getId()) {
                System.out.println("La editorial a modificar es: " + ed.getNombre().toUpperCase());
                try {
                    System.out.println("Ingrese el nuevo nombre a colocar: ");
                    String nuevoNom = leer.next();
                    em.find(Editorial.class, ed.getId());
                    ed.setNombre(nuevoNom);
                    em.getTransaction().begin();
                    em.merge(ed);
                    em.getTransaction().commit();
                } catch (Exception e) {
                    modificarEditorial();
                }
            }
        }
    }

    public void eliminarEditorial() {
        System.out.println("¿Qué editorial desea eliminar?");
        mostrarEditoriales();
        try {
        System.out.println("Ingrese el Id de la editorial tal como sale en el listado: ");
        int edSelec = leer.nextInt();
        int i =0;
            Editorial edAux = em.find(Editorial.class, edSelec);
            for (Editorial ed : editoriales) {
                if (edSelec==ed.getId()) {
                    System.out.println("La editorial a eliminar es: " + ed.getNombre().toUpperCase());
                    edAux = ed;
                }else{
                    i++;
                                   }
            }
             if ((editoriales.size()-i)==0 ) {
                 System.out.println("La editorial "+ edSelec+ " no ha sido encontrada. Ingrese otra para poder eliminarla:");
            }
            
            em.getTransaction().begin();
            em.remove(edAux);
            em.getTransaction().commit();
            System.out.println("Editorial eliminada con éxito.");
        } catch (Exception e) {
            eliminarEditorial();
        }

    }
}
