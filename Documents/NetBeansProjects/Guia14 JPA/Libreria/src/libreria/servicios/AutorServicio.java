package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

public class AutorServicio {

    ArrayList<Autor> autores = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    LibroService ls = new LibroService();

    public Autor crearAutor(String a) {
        Autor au = new Autor();
        au.setAlta(true);
        au.setId(UUID.randomUUID().toString());
        au.setNombre(a.toLowerCase());
        em.getTransaction().begin();
        em.persist(au);
        em.getTransaction().commit();
        autores.add(au);
        System.out.println("Autor " + a + " creado con éxito.");
        return au;
    }

    public List <Autor> mostrarAutores() {
        for (Autor au : autores) {
            System.out.println(au.toString() + "\n");
        }
   return  em.createQuery("SELECT a FROM Autor a").getResultList();
    }

    public Autor elegirAutor() {
        System.out.println("Los autores disponibles son: ");
        mostrarAutores();
        System.out.println("¿Cuál desea elegir? Ingrese el nombre completo como figura en el listado en pantalla: ");
        String au = leer.next();
        Autor auSelec = null;
        Autor aux;
        Boolean band = false;
        for (Autor autore : autores) {
            if (au.equalsIgnoreCase(autore.getNombre())) {
                band = true;
                auSelec = autore;
            }
        }
        if (band == true) {
            System.out.println("Ha seleccionado el autor: " + au.toUpperCase());
            aux = auSelec;
        } else {
            System.out.println("El autor " + au.toUpperCase() + " no se ha encontrado en la lista. Cree uno nuevo: ");
            aux = crearAutor(leer.next());
        }

        return aux;
    }

    public void modificarAutor() {
        System.out.println("¿Qué autor desea modificar?");
        mostrarAutores();
        System.out.println("Ingrese el Id del autor que desea modificar, tal como sale en el listado: ");
        String auSelec = leer.next();
        Autor Aux;
        int op;
        for (Autor au : autores) {
            if (auSelec.equalsIgnoreCase(au.getId())) {
                System.out.println("El autor a modificar es: " + au.getNombre().toUpperCase());
                Aux = au;
                try {
                    System.out.println("Ingrese el nuevo nombre a colocar: ");
                    String nuevoNom = leer.next();
                    em.find(Autor.class, au.getId());
                    au.setNombre(nuevoNom);
                    em.getTransaction().begin();
                    em.merge(au);
                    em.getTransaction().commit();
                } catch (Exception e) {
                    modificarAutor();
                }
            }
        }
    }

    public void eliminarAutor() {
        System.out.println("¿Qué autor desea eliminar?");
         mostrarAutores();
        System.out.println("Ingrese el Id del autor tal como sale en el listado: ");
        String auSelec = leer.next();
        Autor Aux = em.find(Autor.class, auSelec);
        for (Autor au : autores) {
            if (auSelec.equalsIgnoreCase(au.getId())) {
                System.out.println("El libro a eliminar es: " + au.getNombre().toUpperCase());
            }
        }
        em.getTransaction().begin();
        em.remove(Aux);
        em.getTransaction().commit();
        System.out.println("Autor eliminado con éxito.");
    }
    public void buscarAutor(){
        System.out.println("Ingrese el nombre y apellido del autor que desea buscar: ");
        String bus = leer.next();
                for (Autor au: autores) {
                    if (bus.equalsIgnoreCase(au.getNombre())) {
                        System.out.println("El autor " + bus +" ha sido encontrado." );
                    }
        }
    }
}
