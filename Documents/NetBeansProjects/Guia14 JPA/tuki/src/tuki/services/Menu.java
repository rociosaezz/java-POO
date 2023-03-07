package tuki.services;

import java.util.Scanner;
import tuki.persistences.exceptions.LibroException;

public class Menu {
    
    private final LibroService ls = new LibroService();
    private final EditorialService es = new EditorialService();
    private final AutorService as = new AutorService();
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
            System.out.println("7- Busqueda de Autor");
            System.out.println("8- Busqueda de Libro por Titulo");
            System.out.println("9- Salir");
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
                               
                                ls.crearLibro();
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
                        e.getStackTrace();
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
                                as.editarAutor();
                                break;
                            case "c":
                                as.eliminarAutor();
                                break;

                        }
                    } catch (Exception e) {
                        e.getStackTrace();
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
                                es.editarEditorial();
                                break;
                            case "c":

                                break;

                        }
                    } catch (Exception e) {
                        e.addSuppressed(e);
                    }

                    break;
                case 4:
                    System.out.println(ls.mostrarLibros());
                    break;
                case 5:
                    System.out.println(as.mostrarAutores());
                    break;
                case 6:
                    System.out.println(es.mostrarEditoriales());
                    break;
                case 7:
                    System.out.println(as.elegirAutor().toString());

                    break;
                case 8:
                    ls.buscarLibro();

                    break;
                case 9:
                    System.out.println("Desconectando de Libreria la Tutuca. Gracias por elegirnos.");
                    break;
                default:
                    throw new AssertionError();
                    
            }

        } while (op <= 9);

    }
}
