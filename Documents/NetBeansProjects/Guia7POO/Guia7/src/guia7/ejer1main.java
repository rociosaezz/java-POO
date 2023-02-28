
package guia7;

import guia7.Servicio.ejer1LibroService;

public class ejer1main {

    public static void main(String[] args) {
        
        ejer1LibroService LS = new ejer1LibroService();
       
 ejer1Libro L1 = LS.NuevoLibro();
        System.out.println(L1);
    }
    
    
}
