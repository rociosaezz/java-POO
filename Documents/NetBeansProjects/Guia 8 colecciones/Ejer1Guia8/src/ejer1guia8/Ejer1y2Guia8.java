
package ejer1guia8;

import ServiceRazas.ServiceRaza;
import java.util.ArrayList;

/**
 *
 * @author Rocio
 */
public class Ejer1y2Guia8 {

    public static void main(String[] args) {
        ServiceRaza servR = new ServiceRaza();
        ArrayList <String> razasPerros = new ArrayList<>();
        servR.llenarRazas(razasPerros);
        servR.mostrarRazas(razasPerros);
        servR.buscarPerro(razasPerros);
        servR.ordenarRazas(razasPerros);
        servR.mostrarRazas(razasPerros);
        
    }
    
}
