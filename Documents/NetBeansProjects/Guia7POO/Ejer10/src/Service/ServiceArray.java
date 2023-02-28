/*el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
package Service;

import Entidades.Arreglo;
import java.util.Arrays;

public class ServiceArray {
    public Arreglo crearArray(){
        Arreglo ar = new Arreglo();
      // Arrays.fill(ar.getArregloA(), Math.random()*100);
       Arrays.fill(ar.getArregloA(),0,50, Math.random()*100);
        for (int i = 0; i < ar.getArregloA().length; i++) {
           Arrays.fill(ar.getArregloA(),i,i, Math.random()*100);
            //ar.setArregloA((double[]) Math.random()*100)[i];
            // ar.setArregloA((double[]) Math.random()*100)[i];
        }
        for (int i = 0; i < ar.getArregloA().length; i++) {
            System.out.println("Número "+(i+1)+": "+ar.getArregloA()[i]);
        }
       Arrays.fill(ar.getArregloB(), Math.random()*100);                   
        return ar;
    }
    
    
}*/
