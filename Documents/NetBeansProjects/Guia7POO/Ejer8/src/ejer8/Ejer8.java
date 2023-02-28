/*En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada.
*/
package ejer8;

import Entidades.Cadena;
import Service.ServiceCadena;

public class Ejer8 {
    public static void main(String[] args) {
       ServiceCadena cad = new ServiceCadena();
      Cadena c1 = cad.crearFrase();     
      cad.contarVocales(c1);
      cad.invertirFrase(c1);
      cad.vecesRepetido(c1);
      cad.compararLongitud(c1);
     cad.unirFrases(c1);
     cad.reemplazarLetra(c1);
      cad.contiene(c1);
    }
    
}
