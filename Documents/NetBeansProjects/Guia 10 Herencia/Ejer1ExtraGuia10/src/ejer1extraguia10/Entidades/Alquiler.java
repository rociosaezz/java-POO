/*para cada Alquiler se guarda: elnombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.*/
package ejer1extraguia10.Entidades;

import java.util.Date;

public class Alquiler {
    private String nombre;
    private Integer DNI;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Integer posicionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer DNI, Date fechaAlquiler, Date fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    
    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler " + "nombre= " + nombre + ", DNI= " + DNI + ", fechaAlquiler= " + fechaAlquiler + ", fechaDevolucion= " + fechaDevolucion + ", posicionAmarre= " + posicionAmarre + ", barco= " + barco;
    }
    
}
