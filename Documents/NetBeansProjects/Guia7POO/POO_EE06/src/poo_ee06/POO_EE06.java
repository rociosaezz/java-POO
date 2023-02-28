
package poo_ee06;
import Entidad.Ahorcado;
import Servicio.ServicioAhorcado;

 
public class POO_EE06 {

    public static void main(String[] args) {
      
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado a1 = sa.crearJuego();
        sa.juego(a1);        
    }
    
}
