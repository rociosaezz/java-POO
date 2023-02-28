/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejer11;

import java.util.Date;
import java.util.Scanner;

public class Ejer11 {

    public static void main(String[] args) {
        int dia,mes,anio;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");        
        System.out.println("Ingrese un día, mes y año (en números y en orden)");
        dia= leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();        
     Date fecha = new Date(anio, mes, dia);   
     Date fechaActual = new Date();
        System.out.println("La fecha ingresada es: "+fecha.getDate()+"/"+fecha.getMonth()+"/"+fecha.getYear());
        System.out.println("La fecha actual es: "+fechaActual.getDate()+"/"+(fechaActual.getMonth()+1)+"/"+(fechaActual.getYear()+1900));
        System.out.println("La cantidad de años existente entre la fecha ingresada y hoy es de: " + ((fechaActual.getYear()+1900)- (fecha.getYear())));        
    }
    }
