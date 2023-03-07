package libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroService {

    ArrayList<Libro> listaLibros = new ArrayList();
    EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    

    public Libro crearLibro(String titulo, Integer anio, Integer ejemplares, Autor au, Editorial ed) throws LibroException {
        try {
            if (titulo.isEmpty()) {
                throw new LibroException("Debe indicar el titulo del libro");
            }
            if (anio == null) {
                throw new LibroException("Debe indicar el año del libro");
            }
            if (ejemplares == null) {
                throw new LibroException("Debe indicar los ejemplares existentes del libro");
            }
            if (au == null) {
                throw new LibroException("Debe asociar un autor del libro");
            }
            if (ed == null) {
                throw new LibroException("Debe asociar una Editorial del libro");
            }
            if (titulo.isEmpty()) {
                throw new LibroException("Debe indicar el titulo del libro");
            }
        } catch (LibroException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new LibroException("ERROR DE SISTEMA");
        }
        for (Libro li : listaLibros) {
            if (li.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("");
            }
        }
        Libro l = new Libro(UUID.randomUUID().clockSequence(), titulo, anio, ejemplares, ejemplares, ejemplares, true, au, ed);
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();

        listaLibros.add(l);
        System.out.println("Libro: \n" + l.toString() + "\n agregado a la Librería");
        return l;
    }

    public Collection<Libro> mostrarLibros() {
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        try {
            if (listaLibros.isEmpty()) {
                throw new LibroException("La lista de libros está vacía");
            } else {

                for (Libro li : listaLibros) {
                    System.out.println(li.toString() + "\n");
                }
            }
        } catch (LibroException e) {
            e.getMessage();
        }
        return libros;
    }

    public void modificarLibro() throws LibroException {
        System.out.println("¿Qué libro desea modificar?" + mostrarLibros());

        System.out.println("Ingrese el número de ISBN del libro a modificar tal como sale en el listado: ");
        Integer libroSelec = leer.nextInt();
        int op;
        try {
            if (libroSelec == null) {
                throw new LibroException("Debe indicar un ISBN para encontrar un libro");

            }
            Libro LiAux = null;
            for (Libro librix : listaLibros) {
                if (Objects.equals(libroSelec, librix.getId())) {
                    System.out.println("El libro a modificar es: " + librix.getTitulo().toUpperCase());
                    LiAux = librix;
                    do {
                        System.out.println("¿Qué dato desea modificar del libro " + LiAux.getTitulo().toUpperCase() + " ?"
                                + "1. Titulo \n2. Autor \n3. Año \n4. Editorial \n5. Cantidad de ejemplares");
                        op = leer.nextInt();
                    } while (op > 5 || op < 1);
                    try {
                        switch (op) {
                            case 1:
                                System.out.println("Ingrese el nuevo título a colocar: ");
                                String nuevoTit = leer.next();

                                em.find(Libro.class, librix.getId());
                                librix.setTitulo(nuevoTit);
                                em.getTransaction().begin();
                                em.merge(librix);
                                em.getTransaction().commit();
                                break;
                            //System.out.println("SELECT l.titulo FROM Libro l");

                            // Libro librix =em.find
                            case 2:
                                System.out.println("Ingrese el nuevo autor a colocar: ");
                                Autor auxx = as.elegirAutor();
                                em.find(Libro.class, librix.getId());
                                librix.setAutor(auxx);
                                em.getTransaction().begin();
                                em.merge(librix);
                                em.getTransaction().commit();
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo año a colocar: ");
                                Integer nuevoA = leer.nextInt();
                                em.find(Libro.class, librix.getId());
                                librix.setAnio(nuevoA);
                                em.getTransaction().begin();
                                em.merge(librix);
                                em.getTransaction().commit();
                                break;
                            case 4:
                                System.out.println("Ingrese la nueva editorial: ");
                                Editorial edi = es.elegirEditorial();
                                em.find(Libro.class, librix.getId());
                                librix.setEditorial(edi);
                                em.getTransaction().begin();
                                em.merge(librix);
                                em.getTransaction().commit();
                                break;
                            case 5:
                                System.out.println("Ingrese la cantidad de ejemplares: ");
                                Integer ejem = leer.nextInt();
                                em.find(Libro.class, librix.getId());
                                librix.setEjemplares(ejem);
                                em.getTransaction().begin();
                                em.merge(librix);
                                em.getTransaction().commit();
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
            throw e;}
        catch(Exception e){
            e.printStackTrace();
            System.out.println("ERROR DE SISTEMA");
        }}
        
      
        
    

    

    public void eliminarLibro() {
        System.out.println("¿Qué libro desea eliminar?");
        System.out.println("Ingrese el número de ISBN del libro tal como sale en el listado: ");
        Integer libroSelec = leer.nextInt();
        Libro LiAux = em.find(Libro.class, libroSelec);
        for (Libro librix : listaLibros) {
            if (Objects.equals(libroSelec, librix.getId())) {
                System.out.println("El libro a eliminar es: " + librix.getTitulo().toUpperCase());

            }
        }
       
    
        em.getTransaction().begin();
        if(!em.contains(LiAux) ){
        LiAux= em.merge(LiAux);
        }
        em.remove(LiAux);
        em.getTransaction().commit();
    }

    public void buscarLibroPorISBN() {
        mostrarLibros().toString();
        System.out.println("Ingrese el ISBN del libro a buscar");
        String li = leer.next();
        try {
            Libro l = (Libro) em.createQuery("SELECT l" + " FROM Libro l" + " WHERE l.ISBN = :ISBN").setParameter("ISBN", li).getSingleResult();
            System.out.println(l.getId() + l.getTitulo() + l.toString());
        } catch (NoResultException e) {
            System.out.println("No se encontró libro con ese ISBN");
        }
        /*  for (Libro list : listaLibros) {
            if (li.equalsIgnoreCase(list.getISBN())) {
                System.out.println("El libro " + list.getTitulo() + "fue encontrado: \n " + list.toString());
                auxLi = list;
            }*/
    }

    public Libro buscarLibroPorTitulo() {
        mostrarLibros();
        System.out.println("Ingrese el titulo del libro a buscar");
        String li = leer.next();
        Libro auxLi = null;
        try {
            for (Libro list : listaLibros) {
                if (li.equalsIgnoreCase(list.getTitulo())) {
                    System.out.println("El libro " + list.getTitulo() + "fue encontrado: \n " + list.toString());
                    auxLi = em.find(Libro.class, list.getId());
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return auxLi;
    }

    public List<Editorial> buscarPorEditorial() {
        mostrarLibros();
        System.out.println("Ingrese la ID de la editorial a buscar");
        Integer li = leer.nextInt();
        List<Editorial> aux = em.createQuery("SELECT l" + " FROM Libro l" + " WHERE l.editorial = :l.editorial.nombre").setParameter("l.editorial.nombre", li).getResultList();

        for (Libro list : listaLibros) {
            if (Objects.equals(li, list.getId())) {
                System.out.println("La editorial" + list.getEditorial().getNombre().toUpperCase() + "fue encontrada: \n " + list.getEditorial().toString());
                em.find(Libro.class, list.getId());
            }
        }
        return aux;
    }

    public List<Libro> buscarPorAutor() {
        System.out.println("Ingrese el ID del Autor que desea buscar");
        Autor li = new Autor(leer.next(), "nombre", Boolean.FALSE);
        return em.createQuery("SELECT l FROM Libro l WHERE l.autor LIKE :autor").setParameter("autor", li).getResultList();
    }

}
