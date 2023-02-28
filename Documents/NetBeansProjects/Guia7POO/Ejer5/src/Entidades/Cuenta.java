
package Entidades;

import java.util.Scanner;

/**
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero)
 */
public class Cuenta {
    
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
 private int numeroCuenta;
 private String dni;
 private double SaldoActual = 20000;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String dni, double SaldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.SaldoActual = SaldoActual;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
 
         
}
