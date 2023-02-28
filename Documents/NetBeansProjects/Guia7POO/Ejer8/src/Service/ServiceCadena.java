/*Deberá además implementar los siguientes métodos:*/
package Service;

import Entidades.Cadena;
import java.util.Scanner;

public class ServiceCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public Cadena crearFrase(){        
        Cadena cad = new Cadena();
        System.out.println("Ingrese una frase: ");
        cad.setFrase(leer.next().toLowerCase()+"\r");
        cad.setLongitud(cad.getFrase().length());
        return cad;
    }
    
    public int contarVocales(Cadena cad){
        int cont = 0;
        String vector[] = new String [5];
        vector[0] = "a";
        vector[1] = "e";
        vector[2] = "i";
        vector[3] = "o";
        vector[4] = "u";
        for (int i = 0; i < cad.getLongitud(); i++) {
            for (int j = 0; j < 5; j++) {
                if (cad.getFrase().substring(i,i+1).equals(vector[j]) ) {
                cont++;   }                
            }           
            }      
        System.out.println("La cantidad de vocales encontradas en su frase es de : "+cont);
        return cont;}
    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cad){
        System.out.print("Frase invertida:");
        for (int i = cad.getLongitud()-1; i >=0 ; i--) {
            System.out.print(cad.getFrase().charAt(i));
            }
        System.out.println("");
    }
   
    //c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase
    public int vecesRepetido(Cadena cad){
         System.out.println("¿Qué letra desea contabilizar en su frase?");
         String letra = leer.next();
        String frase = cad.getFrase();
        int cont=0;
//letra.contains(frase);
        for (int i = cad.getLongitud()-1; i >=0 ; i--) {
            if (frase.substring(i,i+1).equals(letra)) {
                cont++;
            }}
        System.out.println("La cantidad de veces que la letra '"+letra+ "' fue encontrada en su frase es de : "+cont);
        return cont;    }
    
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
public int compararLongitud(Cadena cad){
         System.out.println("Ingrese una nueva frase: ");
         String nuevaFrase = leer.next();
int longitud = nuevaFrase.compareToIgnoreCase(cad.getFrase());
    if (longitud==0) {
            System.out.println("Las frases tienen la misma longitud");
    }else if(longitud<0){
        System.out.println("La frase ingresada: "+nuevaFrase+" es más corta que la anterior: "+cad.getFrase());
        }else if (longitud>=1) {
        System.out.println("La frase anterior: "+cad.getFrase()+" es más corta que la nueva: "+nuevaFrase);
    }
return longitud;
}
/*f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
public void unirFrases(Cadena cad){
    System.out.println("Ingrese una nueva frase para unir con la original:");
   String nFrase = leer.next();
   
    System.out.println("Frase resultante: " +cad.getFrase()+" " +nFrase+".");
}
/*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.*/
public String reemplazarLetra(Cadena cad){
    System.out.println("¿Por qué caracter desea reemplazar las 'a' de su frase?");
   String caracter = leer.next();
   String newFrase = cad.getFrase();
    for (int i = 0; i < cad.getLongitud(); i++) {
        if (cad.getFrase().charAt(i) == 'a') {
           newFrase = cad.getFrase().replaceAll(cad.getFrase().substring(i), caracter);
        }
    }
    System.out.println("Su frase queda así: "+newFrase);
    return newFrase;
}

/*h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
public boolean contiene(Cadena cad){
    boolean contiene = false;
    System.out.println("¿Qué letra desea buscar en su frase?");
   String letra = leer.next();
         if (cad.getFrase().contains(letra)){
             contiene=true;
         }    
     System.out.println("La letra "+letra+" se encuentra en su frase(True/False): "+contiene);
    return contiene;
}
}
