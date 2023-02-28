package tienda.entidades;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Fabricante {
    //@Id
     //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer codigo;
    //@Basic
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
