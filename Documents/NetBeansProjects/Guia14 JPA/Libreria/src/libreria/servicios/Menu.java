
package libreria.servicios;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Menu {

    private final LibroService ls = new LibroService();
    private final EditorialServicio es = new EditorialServicio();
    private final AutorServicio as = new AutorServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void ejecutar() throws Exception {
        int op;
        do {
            System.out.println("____________________ MENU - LIBRERIA LA TUTUCA ____________________");
            System.out.println("1- Agregar/Modificar/Borrar Libro");
            System.out.println("2- Agregar/Modificar/Borrar Autor");
            System.out.println("3- Agregar/Modificar/Borrar Editorial");
            System.out.println("4- Mostrar lista completa de Libros");
            System.out.println("5- Mostrar lista completa de Autores");
            System.out.println("6- Mostrar lista completa de Editoriales");
            System.out.println("7- Busqueda de Autor por nombre");
            System.out.println("8- Busqueda de Libro por ISBN");
            System.out.println("9- Busqueda de Libro por Titulo");
            System.out.println("10- Busqueda de Libro por Editorial");
            System.out.println("11- Busqueda de Libro por Autor");
            System.out.println("12- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("a) Agregar");
                    System.out.println("b) Modificar");
                    System.out.println("c) Borrar");
                    String aux = leer.next();

                    try {
                        switch (aux) {
                            case "a":
                                try{
                                System.out.println("Ingrese Titulo del libro");
                                String titulo = leer.next();
                                System.out.println("Ingrese Año del libro");
                                int anio = leer.nextInt();
                                System.out.println("Ingrese cantidad de Ejemplares");
                                int ejemplares = leer.nextInt();
                                ls.crearLibro(titulo, anio, ejemplares, as.elegirAutor(), es.elegirEditorial());
                                }catch(LibroException e){
                                    System.out.println(e.getMessage());
                                }catch(Exception e ){
                                            System.out.println(e.getMessage());
                                            }
                                
                                break;
                            case "b":
                                ls.modificarLibro();
                                break;
                            case "c":
                                ls.eliminarLibro();
                                break;

                        }
                    } catch (Exception e) {
                        ejecutar();
                    }

                    break;

                case 2:
                    System.out.println("a) Agregar");
                    System.out.println("b) Modificar");
                    System.out.println("c) Borrar");
                    aux = leer.next();

                    try {
                        switch (aux) {
                            case "a":
                                System.out.println("Ingrese nombre del autor a ingresar");
                                as.crearAutor(leer.next());

                                break;
                            case "b":
                                as.modificarAutor();
                                break;
                            case "c":
                                as.eliminarAutor();
                                break;

                        }
                    } catch (Exception e) {
                        ejecutar();
                    }

                    break;
                case 3:
                    System.out.println("a) Agregar");
                    System.out.println("b) Modificar");
                    System.out.println("c) Borrar");
                    aux = leer.next();

                    try {
                        switch (aux) {
                            case "a":
                                System.out.println("Ingrese nombre de la editorial a ingresar");
                                es.crearEditorial(leer.next());

                                break;
                            case "b":
                                es.modificarEditorial();
                                break;
                            case "c":

                                break;

                        }
                    } catch (Exception e) {
                        ejecutar();
                    }

                    break;
                case 4:
                    ls.mostrarLibros();
                    break;
                case 5:
                    System.out.println(as.mostrarAutores());
                    break;
                case 6:
                    es.mostrarEditoriales();
                    break;
                case 7:
                    as.buscarAutor();

                    break;
                case 8:
                    ls.buscarLibroPorISBN();

                    break;
                case 9:
                    ls.buscarLibroPorTitulo();

                    break;
                case 10:
                    ls.buscarPorEditorial();
                    break;
                case 11:
                    System.out.println(ls.buscarPorAutor());
                    break;
                case 12:
                    System.out.println("Desconectando de Libreria la Tutuca. Gracias por elegirnos.");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (op != 12);

    }
}
