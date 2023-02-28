/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.*/
package ejer1extraguia10.Entidades;

import java.util.List;

public class Barco {
protected String matricula;
protected Integer metros;
protected Integer año;

    public Barco(String matricula, Integer metros, Integer año) {
        this.matricula = matricula;
        this.metros = metros;
        this.año = año;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Barco \t" + "matricula=" + matricula + ", metros=" + metros + ", año=" + año + "\t";
    }

}
