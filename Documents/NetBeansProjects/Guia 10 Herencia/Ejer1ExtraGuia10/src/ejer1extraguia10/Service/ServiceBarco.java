package ejer1extraguia10.Service;

import ejer1extraguia10.Entidades.Alquiler;
import ejer1extraguia10.Entidades.Barco;
import ejer1extraguia10.Entidades.BarcoAMotor;
import ejer1extraguia10.Entidades.Velero;
import ejer1extraguia10.Entidades.Yate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 */
public class ServiceBarco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler(ArrayList<Alquiler> alq) {
        Alquiler a = new Alquiler();
        System.out.println("---Bienvenido---\nIngrese su nombre: ");
        a.setNombre(leer.next());
        System.out.println("Ingrese su DNI:");
        a.setDNI(leer.nextInt());
        Integer op;
        do{
        System.out.println("¿Qué tipo de barco desea? Ingrese la opción indicada:\n 1. Velero\n2.Barco a motor \n3.Yate \n 9.Salir");
        op= leer.nextInt();
        switch (op) {
            case 1:
                Velero v = new Velero();
                v.setMetros(40);
                v.setMatricula("ABC123");
                v.setAño(1995);
                System.out.println("¿de cuántos mástiles desea su velero?");
                v.setMastiles(leer.nextInt());
                System.out.println("¿Desde qué fecha desea alquilarlo? AAAA/MM/DD");
                Date fechaInicio = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                a.setFechaAlquiler(fechaInicio);
                System.out.println("¿Hasta qué fecha desea alquilarlo? AAAA/MM/DD");
                Date fechaFin = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                a.setFechaDevolucion(fechaFin);
                System.out.println("¿En qué muelle va a amarrar su barco? 1 al 10");
                int muelle = leer.nextInt();
                for (Alquiler al : alq) {
                    if (al.getPosicionAmarre() == muelle) {
                        System.out.println("La posición elegida se encuentra ocupada, elija otra por favor");
                        muelle = leer.nextInt();
                        while (muelle > 10 || muelle < 1) {
                            System.out.println("Ingrese un muelle entre el 1 y el 10");
                            muelle = leer.nextInt();
                        }
                    }
                }
                ServiceVelero sv = new ServiceVelero();

                a.setPosicionAmarre(muelle);
                a.setBarco(v);
                sv.calcularAlquiler(a, v);
                System.out.println("El valor del alquiler de su barco " + v.toString() + " es de: $" + sv.calcularAlquiler(a));
                break;
            case 2:
                BarcoAMotor bam = new BarcoAMotor();
                bam.setMetros(30);
                bam.setMatricula("EDC223");
                bam.setAño(1987);
                System.out.println("¿De cuánta potencia desea su Barco? Ingrese el valor en CV");
                bam.setPotencia(leer.nextInt());
                System.out.println("¿Desde qué fecha desea alquilarlo? AAAA/MM/DD");
                Date fechaInic = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                a.setFechaAlquiler(fechaInic);
                System.out.println("¿Hasta qué fecha desea alquilarlo? AAAA/MM/DD");
                Date fechaFi = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                a.setFechaDevolucion(fechaFi);
                System.out.println("¿En qué muelle va a amarrar su barco? 1 al 10");
                int muell = leer.nextInt();
                for (Alquiler al : alq) {
                    if (al.getPosicionAmarre() == muell) {
                        System.out.println("La posición elegida se encuentra ocupada, elija otra por favor");
                        muell = leer.nextInt();
                        while (muell > 10 || muell < 1) {
                            System.out.println("Ingrese un muelle entre el 1 y el 10");
                            muell = leer.nextInt();
                        }
                    }
                }
                a.setPosicionAmarre(muell);
                a.setBarco(bam);
                ServiceBarcoAMotor sbam = new ServiceBarcoAMotor();
                sbam.calcularAlquiler(a);
                System.out.println("El valor del alquiler de su barco " + bam.toString() + " es de: $" + sbam.calcularAlquiler(a));
                break;
            case 3:
                Yate y = new Yate();
                 y.setMetros(50);
                y.setMatricula("WER456");
                y.setAño(2011);
                System.out.println("¿De cuánta potencia desea su yate? Ingrese el valor en CV");
                y.setPotencia(leer.nextInt());
                System.out.println("¿de cuántos camarotes desea su yate?");
                y.setCamarotes(leer.nextInt());
                System.out.println("¿Desde qué fecha desea alquilarlo? AAAA/MM/DD");
                Date fechaIn = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                a.setFechaAlquiler(fechaIn);
                System.out.println("¿Hasta qué fecha desea alquilarlo? AAAA/MM/DD");
                Date fechaF = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                a.setFechaDevolucion(fechaF);
                System.out.println("¿En qué muelle va a amarrar su barco? 1 al 10");
                int mu = leer.nextInt();
                for (Alquiler al : alq) {
                    if (al.getPosicionAmarre() == mu) {
                        System.out.println("La posición elegida se encuentra ocupada, elija otra por favor");
                        mu = leer.nextInt();
                        while (mu > 10 || mu < 1) {
                            System.out.println("Ingrese un muelle entre el 1 y el 10");
                            mu = leer.nextInt();
                        }
                    }
                }
                ServiceYate sy = new ServiceYate();
                a.setPosicionAmarre(mu);
                a.setBarco(y);
                System.out.println("El valor del alquiler de su barco " + y.toString() + " es de: $" + sy.calcularAlquiler(a));

                break;
            default:
                System.out.println("Debe ingresar una opción: 1, 2 o 3");
        }}while(op!=9);

        return a;
    }

    public Integer calcularModulo(Alquiler a) {
        Integer mod = a.getBarco().getMetros() * 10;
        return mod;
    }

    public Integer calcularAlquiler(Alquiler a) {

        Integer dias = a.getFechaDevolucion().getDay() - a.getFechaAlquiler().getDay();
        /*if (a.getFechaDevolucion().getMonth()>a.getFechaAlquiler().getMonth()) {
            dias= dias+30;
        }*/
        System.out.println("Cantidad de días reservados: "+dias);
        Integer alquiler = dias * (a.getBarco().getMetros() * 10);
        return alquiler;

    }

    public void asignarBarco(List<Alquiler> a, List<Barco> ab) {
        int i = 0;
        for (Alquiler alqui : a) {
            alqui.setBarco(ab.get(i));
            i++;
            System.out.println("El barco asignado a " + alqui.getNombre() + " es: " + alqui.getBarco().toString());
        }
    }
    /**
     * En los barcos de tipo especial el módulo de cada barco se calcula sacando
     * el módulo normal y sumándole el atributo particular de cada barco. En los
     * veleros se suma el número de mástiles, en los barcos a motor se le suma
     * la potencia en CV y en los yates se suma la potencia en CV y el número de
     * camarotes.
     */

}
