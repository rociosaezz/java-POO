/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rocio
 */
@Entity
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer codigo;
    @Basic
    private String nombre;
    private Double precio;
    @Temporal(TemporalType.DATE)
    private Date fechaDeFabricacion;
    @ManyToOne
    private Fabricante codigoFabricante;

    public Date getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(Date fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public Producto(Date fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, Double precio, Fabricante codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Fabricante getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(Fabricante codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }


    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigoFabricante=" + codigoFabricante + '}';
    }
    
}
