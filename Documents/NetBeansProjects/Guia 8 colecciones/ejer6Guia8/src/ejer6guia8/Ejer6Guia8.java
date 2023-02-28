
package ejer6guia8;

import Servicios.ServiceProduct;
import java.util.HashMap;

public class Ejer6Guia8 {

  
    public static void main(String[] args) {
        HashMap < String, Double> listaProductos = new  HashMap <>();
        ServiceProduct sp = new ServiceProduct();
        sp.listaProductos (listaProductos);
        sp.mostrarProductos(listaProductos);
        sp.modificarPrecio(listaProductos);
        sp.eliminarProducto(listaProductos);
        
    }
    
}
