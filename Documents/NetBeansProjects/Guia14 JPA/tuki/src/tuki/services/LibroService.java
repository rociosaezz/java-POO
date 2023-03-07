package tuki.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.UUID;
import tuki.entidades.Autor;
import tuki.entidades.Editorial;
import tuki.entidades.Libro;
import tuki.persistences.ControladoraPersistencia;
import tuki.persistences.exceptions.LibroException;

public class LibroService {

    ArrayList<Libro> listaLibros = new ArrayList();
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    AutorService as = new AutorService();
    EditorialService es = new EditorialService();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro() throws LibroException {        
        try {
            Libro l = new Libro();
            System.out.println("Ingrese Titulo del libro");
            String tit= leer.next();
            System.out.println("Ingrese Año del libro");
            int anio=leer.nextInt();
            System.out.println("Ingrese cantidad de Ejemplares");
            int ejemplares = leer.nextInt();
            System.out.println("Ingrese la opción deseada: \n1 Si desea crear un autor nuevo \n2. Si desea buscar en la lista de autores existentes");
            int op = leer.nextInt();
            Autor au;
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre completo del autor a crear: ");
                    au=as.crearAutor(leer.next());                    
                    break;
                case 2:
                   au=as.elegirAutor();                    
                    break;
                default:
                    System.out.println("Debe ingresar una opción valida");
                    throw new AssertionError();
            }
            System.out.println("Ingrese la opción deseada: \n1 Si desea crear una nueva editorial \n2. Si desea buscar en la lista de editoriales existentes");
            int opt = leer.nextInt();
            Editorial ed;
             switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre completo de la editorial a crear: ");
                   ed= es.crearEditorial(leer.next());
                    break;
                case 2:
                    ed= es.elegirEditorial();                    
                    break;
                default:
                    System.out.println("Debe ingresar una opción valida");
                    throw new AssertionError();
            }
            
            if (tit.isEmpty()) {
                throw new LibroException("Debe indicar el titulo del libro");
            }
            if (anio == 0) {
                throw new LibroException("Debe indicar el año del libro");
            }
            if (ejemplares == 0) {
                throw new LibroException("Debe indicar los ejemplares existentes del libro");
            }
            if (au == null) {
                throw new LibroException("Debe asociar un autor del libro");
            }
            if (ed == null) {
                throw new LibroException("Debe asociar una Editorial del libro");
            }
             l.setAlta(true);
             l.setTitulo(tit);
             l.setAnio(anio);
             l.setEjemplares(ejemplares);
        l.setAutor(au);
        l.setEditorial(ed);
             controlPersis.crearLibro(l);
        listaLibros.add(l);
        System.out.println("Libro: \n" + l.toString() + "\n agregado a la Librería");
        } catch (LibroException e) {
            throw e;
        } catch (Exception e) {
            throw new LibroException("ERROR DE SISTEMA");      }
              
    }

    public Collection<Libro> mostrarLibros() {
        try {
            if (controlPersis.mostrarLibreria().isEmpty()) {
                throw new LibroException("La lista de libros está vacía");
            
            }
        } catch (LibroException e) {
            e.getMessage();
        }
        return controlPersis.mostrarLibreria();
    }

    public void buscarLibro() {
        System.out.println("Ingrese el titulo del libro a buscar: ");
        String tit = leer.next();
        boolean band = false;
        for (Libro lib : controlPersis.mostrarLibreria()) {
       if (lib.getTitulo().equalsIgnoreCase(tit)) {
                int l = lib.getId();
                System.out.println("El libro " + tit.toUpperCase() + " ha sido encontrado en la lista: \n" + lib.toString());
                band = true;
                controlPersis.buscarLibro(l);
            }            
        }                   
        if (band == false) {
            System.out.println("El autor no se ha encontrado en la lista. Cree uno nuevo.");
        }
    }

    public void modificarLibro() throws LibroException {
        System.out.println("¿Qué libro desea modificar?" + mostrarLibros().toString());
        System.out.println("Ingrese el número de ISBN del libro a modificar tal como sale en el listado: ");
        Integer libroSelec = leer.nextInt();
        int op = 0;
        Libro LiAux = null;
        try {
            if (libroSelec == null) {
                throw new LibroException("Debe indicar un ISBN para encontrar un libro");
            }

            controlPersis.buscarLibro(libroSelec);

            for (Libro librix : listaLibros) {
                if (libroSelec == librix.getId()) {
                    System.out.println("El libro a modificar es: " + librix.getTitulo().toUpperCase());
                    LiAux = librix;
                    do {
                        System.out.println("¿Qué dato desea modificar del libro " + librix.getTitulo().toUpperCase() + " ?"
                                + "1. Titulo \n2. Autor \n3. Año \n4. Editorial \n5. Cantidad de ejemplares existentes");
                        op = leer.nextInt();
                    } while (op > 5 || op < 1);
                    try {
                        switch (op) {
                            case 1:
                                System.out.println("Ingrese el nuevo título a colocar: ");
                                librix.setTitulo(leer.next());
                                controlPersis.editarLibro(librix);
                                break;

                            case 2:
                                System.out.println("Ingrese el nuevo autor a colocar: ");
                                librix.setAutor(as.elegirAutor());
                                controlPersis.editarLibro(librix);
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo año a colocar: ");
                                librix.setAnio(leer.nextInt());
                                controlPersis.editarLibro(librix);
                                break;
                            case 4:
                                System.out.println("Ingrese la nueva editorial: ");
                                librix.setEditorial(es.elegirEditorial());
                                controlPersis.editarLibro(librix);
                                break;
                            case 5:
                                System.out.println("Ingrese la cantidad de ejemplares: ");
                                librix.setEjemplares(leer.nextInt());
                                controlPersis.editarLibro(librix);
                                break;
                            default:
                                System.out.println("Ingrese una opción válida.");
                                modificarLibro();
                                break;
                        }
                    } catch (Exception e) {
                        modificarLibro();

                    }
                    break;
                }
            }
            if (LiAux == null) {
                throw new LibroException("No se encontro un libro con el ISBN indicado");
            }
        } catch (LibroException e) {
            throw e;
        } catch (Exception e) {
            System.out.println("ERROR DE SISTEMA");
        }
    }

    public void eliminarLibro() {
        System.out.println("¿Qué libro desea eliminar? \n");
        System.out.println("Ingrese el número de ISBN del libro tal como sale en el listado: ");
        Integer idEliminar = leer.nextInt();
        for (Libro librix : listaLibros) {
            if (idEliminar == librix.getId()) {
                System.out.println("El libro a eliminar es: " + librix.getTitulo().toUpperCase());
            }
        }
        controlPersis.eliminarLibro(idEliminar);
        System.out.println("Libro eliminado con éxito");
    }

}
