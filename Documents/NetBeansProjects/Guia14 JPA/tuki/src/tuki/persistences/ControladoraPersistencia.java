package tuki.persistences;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tuki.entidades.Autor;
import tuki.entidades.Editorial;
import tuki.entidades.Libro;
import tuki.persistences.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    LibroJpaController ljc = new LibroJpaController();
    EditorialJpaController ejc = new EditorialJpaController();
    AutorJpaController ajc = new AutorJpaController();

    public void crearLibro(Libro l) {
        ljc.create(l);
    }

    public void eliminarLibro(int id) {
        try {
            ljc.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Collection<Libro> mostrarLibreria() {
        return ljc.findLibroEntities();
    }

    public Libro buscarLibro(int id) {
        return ljc.findLibro(id);
    }

    public void editarLibro(Libro l) {
        try {
            ljc.edit(l);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearAutor(Autor au) {
        ajc.create(au);
    }

    public List<Autor> mostrarAutores() {
        return ajc.findAutorEntities();
    }

    public Autor buscarAutor(int au) {
        return ajc.findAutor(au);
    }

    public void editarAutor(Autor a) {
        try {
            ajc.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarAutor(int auSelec) {
        try {
            ajc.destroy(auSelec);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearEditorial(Editorial ed) {
   ejc.create(ed);
    }

    public List<Editorial> mostrarEditoriales() {
    return ejc.findEditorialEntities();
    }


    public Editorial buscarEditorial(int ed) {
      return ejc.findEditorial(ed);
    }

    public void editarEditorial(Editorial edi) {
        try {
            ejc.edit(edi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEditorial(int edSelec) {
        try {
            ejc.destroy(edSelec);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
