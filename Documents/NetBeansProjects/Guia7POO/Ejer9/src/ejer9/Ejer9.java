/* En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

 */
package ejer9;

import Entidades.Matematica;
import Service.ServiceMatematica;

public class Ejer9 {

    public static void main(String[] args) {
        ServiceMatematica math = new ServiceMatematica();
        Matematica m1 = math.crearMat();
        math.devolverMayor(m1);
        math.calcularPotencia(m1);
        math.calculaRaiz(m1);
        
    }
    
}
