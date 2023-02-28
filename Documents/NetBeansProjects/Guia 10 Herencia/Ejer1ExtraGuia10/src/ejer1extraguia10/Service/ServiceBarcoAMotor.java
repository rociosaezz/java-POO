package ejer1extraguia10.Service;

import ejer1extraguia10.Entidades.Alquiler;
import ejer1extraguia10.Entidades.BarcoAMotor;

/**en los barcos a motor se le suma la
  potencia en CV y en los yates se suma la potencia en CV y el número de camarotes */
public class ServiceBarcoAMotor extends ServiceBarco{

    public Integer calcularAlquiler(Alquiler a, BarcoAMotor bam) {
        return super.calcularAlquiler(a)+ bam.getPotencia();   }
    
}
