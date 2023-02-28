package ejer1extraguia10.Service;

import ejer1extraguia10.Entidades.Alquiler;
import ejer1extraguia10.Entidades.Velero;

/**veleros se suma el número de mástiles*/
public class ServiceVelero extends ServiceBarco {

    public Integer calcularAlquiler(Alquiler a, Velero v ) {
        
        return super.calcularAlquiler(a)+v.getMastiles();    }
    
}
