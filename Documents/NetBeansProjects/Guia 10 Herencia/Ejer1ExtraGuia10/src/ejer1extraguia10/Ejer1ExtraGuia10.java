package ejer1extraguia10;

import ejer1extraguia10.Entidades.Alquiler;
import ejer1extraguia10.Entidades.Barco;
import ejer1extraguia10.Entidades.BarcoAMotor;
import ejer1extraguia10.Entidades.Velero;
import ejer1extraguia10.Entidades.Yate;
import ejer1extraguia10.Service.ServiceBarco;
import ejer1extraguia10.Service.ServiceBarcoAMotor;
import ejer1extraguia10.Service.ServiceVelero;
import ejer1extraguia10.Service.ServiceYate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
 * Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
 * fecha de devolución, la posición del amarre y el barco que lo ocupará. Un
 * Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación. Sin embargo, se pretende diferenciar la información de algunos
 * tipos de barcos especiales: • Número de mástiles para veleros. • Potencia en
 * CV para barcos a motor. • Potencia en CV y número de camarotes para yates de
 * lujo. Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 */
public class Ejer1ExtraGuia10 {

    public static void main(String[] args) {
       
        
        
      /*  ServiceBarco sb = new ServiceBarco();

        List<Barco> ab = new ArrayList<>();
        Barco vel = new Barco("ABC123", 8, 1996);
        ab.add(vel);
        Barco BaM = new Barco("UJU123", 10, 1999);
        ab.add(BaM);
        Barco Ya = new Barco("AAN123", 16, 2005);
        ab.add(Ya);
        Barco b1 = new Barco("SDL984", 30, 2001);
        ab.add(b1);
        int i=0;
        ArrayList <Alquiler> alq = new ArrayList<>();
        
       
         sb.crearAlquiler(alq);
       for (Alquiler alquiler : alq) {
            System.out.println("Barco "+i+1+":"+alquiler.toString());
        }/* for (Alquiler al : alq) {
            switch (al.getBarco().getTipo().toLowerCase()) {
                case "barco\n":
                    System.out.println("El precio del alquiler para " + al.getNombre() + " es de: " + sb.calcularAlquiler(a));
                case "velero":
                    ServiceVelero sv = new ServiceVelero();
                    System.out.println("El precio del alquiler para " + al.getNombre() + " es de: " + sv.calcularAlquiler(a, vel));
                case "barco a motor":
                    ServiceBarcoAMotor sbam = new ServiceBarcoAMotor();
                    System.out.println("El precio del alquiler para " + al.getNombre() + " es de: " + sbam.calcularAlquiler(a, BaM));
                case "yate":
                    ServiceYate sy = new ServiceYate();
                    System.out.println("El precio del alquiler para " + al.getNombre() + " es de: " + sy.calcularAlquiler(a, Ya));
                default:
                    System.out.println("");
            }*/
    }
}
