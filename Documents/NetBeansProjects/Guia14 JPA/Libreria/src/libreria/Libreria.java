package libreria;

import java.util.Scanner;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroException;
import libreria.servicios.LibroService;

public class Libreria {

    public static void main(String[] args) throws LibroException {
        
    
    private LibroService ls = new LibroService();
    private EditorialServicio es = new EditorialServicio();
    private AutorServicio as = new AutorServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int op;

    
        try{    
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
                                try {
                                System.out.println("Ingrese Titulo del libro");
                                String titulo = leer.next();
                                System.out.println("Ingrese Año del libro");
                                int anio = leer.nextInt();
                                System.out.println("Ingrese cantidad de Ejemplares");
                                int ejemplares = leer.nextInt();
                                ls.crearLibro(titulo, anio, ejemplares, as.elegirAutor(), es.elegirEditorial());
                            } catch (LibroException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }

                            break;
                            case "b":
                                ls.modificarLibro();
                                break;
                            case "c":
                                ls.eliminarLibro();
                                break;

                        }
                    } catch (Exception ex) {
                        System.out.println("ERROR DE SISTEMA");
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
                        e.printStackTrace();
                        System.out.println("ERROR DE SISTEMA");
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
                                es.eliminarEditorial();
                                break;

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("ERROR DE SISTEMA");
                    }

                    break;
                case 4:
                    ls.mostrarLibros();
                    break;
                case 5:
                    List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                    for (Object libro : libros) {
                        System.out.println(libro.toString());
                    }
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

    }    catch(LibroException e){
            e.getMessage();
    }    catch(Exception ex){
        System.out.println("Error de ejecucion");
    }
}} 





/*Autor a1 = new Autor;
        Editorial ed1 = new Editorial();
        a1.setNombre("Todorov");
        a1.setAlta(true);
        ed1.setAlta(true);
        ed1.setNombre("Siglo XXI");
         em.getTransaction().begin();
        em.persist(l1);
        em.persist(a1);
        em.persist(ed1);
        em.getTransaction().commit();
        

        Libro l1 = new Libro();
        l1.setTitulo("La Conquista de América");
        l1.setAlta(true);
        l1.setAnio(2012);
        l1.setAutor(a1);
        l1.setEditorial(ed1);
        l1.setISBN(UUID.randomUUID().toString());
        Autor a2 = new Autor(UUID.randomUUID().toString(), "Las pepas", true);
        Editorial ed2 = new Editorial(UUID.randomUUID().toString(), "Mundo mágico", true);
        Autor a3 = new Autor(UUID.randomUUID().toString(), "Eduardo Galeano", true);
        Editorial ed3 = new Editorial(UUID.randomUUID().toString(), "Paidós", true);

       

        Libro l2 = new Libro(UUID.randomUUID().toString(), "Sapo Pepe", 1997, 5, 0, 5, true, a2, ed1);
        em.getTransaction().begin();
        em.persist(l2);
        em.persist(a2);
        em.persist(ed2);
        em.getTransaction().commit();

        Libro l3 = new Libro(UUID.randomUUID().toString(), "Las venas abiertas de América Latina", 2006, 2, 1, 1, true, a3, ed3);
        em.getTransaction().begin();
        em.persist(l3);
        em.persist(a3);
        em.persist(ed3);
        em.getTransaction().commit();

        

    
  Libro libro = em.find(Libro.class, l1.getISBN());
   libro.setTitulo("El problema del otro");
   em.getTransaction().begin();
   em.getTransaction().commit();
   em.merge(libro);
 
   
 //List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
   
     
 //       libro2 = (Libro) em.createQuery("SELECT l "+ "FROM libro l " + "WHERE l.titulo  : "+tit);
   //Libro libro3 = em.find(Libro.class, l1.getISBN());
   
//Collection <Libro> libritos = em.createQuery("SELECT l"+ "FROM Libro l").getResultList();

    }
    
 }
