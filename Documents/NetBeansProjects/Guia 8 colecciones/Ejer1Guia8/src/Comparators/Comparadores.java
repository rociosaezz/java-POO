
package Comparators;

import RazasPerros.Razas;
import java.util.Comparator;

public class Comparadores {
   public static Comparator <Razas> ordenarAlfabeticamente = new Comparator <Razas> (){
       @Override
       public int compare(Razas t, Razas t1) {
           return t.getRaza().compareToIgnoreCase(t1.getRaza());
       }      
   };
}
