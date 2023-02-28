
package ejer3;

import Entidades.Operacion;
import Service.OperacionService;

public class Ejer3 {

    public static void main(String[] args) {
        OperacionService O1 = new OperacionService();
        Operacion cuentas = O1.crearOperacion();
                System.out.println("Suma: "); O1.sumar(cuentas, cuentas);
                System.out.println("Resta: "); O1.restar(cuentas, cuentas);
                System.out.println("Multiplicación: "); O1.multiplicar(cuentas, cuentas);
                System.out.println("División: "); O1.dividir(cuentas, cuentas);
                
        
    }
    
}
