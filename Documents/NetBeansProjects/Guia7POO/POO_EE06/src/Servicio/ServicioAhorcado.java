
package Servicio;
import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;



public class ServicioAhorcado {
    
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    int cont=0;
    char[] letrasIngresadas = new char[20];
    char[] palabraVacia = new char[20];
    
    
/*le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0*/
    public Ahorcado crearJuego(){
        Ahorcado ahor = new Ahorcado();
        String palabra;
        System.out.println("JUEGO AHORCADO\n");
        System.out.println("Ingrese la palabra secreta");
         palabra=leer.next();   
        System.out.println("¿Cuántos intentos desea que tenga el usuario del juego? (en número)");
         ahor.setCant_intent(leer.nextInt());  
          ahor.setCant_letras(0);
          ahor.setPalabra(palabra);
         ahor.setPalabra_secreta(palabra.toCharArray()); 
         ahor.setLongitud(palabra.length()); 
        return ahor;
    }
   
    public int longitud(Ahorcado ahor){      
        System.out.println("La cantidad de letras es de: " + ahor.getLongitud());
        return ahor.getLongitud();
    }
    
    /*Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    public void buscar( Ahorcado ahor,int cont){
        
        System.out.println("Ingrese una letra");
         String letra= leer.next();
         do{
        boolean validarLetra = Arrays.toString(letrasIngresadas).contains(letra);   
            if (validarLetra) {
             System.out.println("Ya ingresaste esa letra, intenta con otra!Pierdes un intento"); 
            ahor.setCant_intent(ahor.getCant_intent()-1);
             intentos(ahor);
            letra= leer.next();
            } 
        } while (Arrays.toString(letrasIngresadas).contains(letra));
            
           
        ahor.setLetra(letra.charAt(0));
        boolean ban =  ahor.getPalabra().contains(letra);
        if (ban == true){
            for (int i = 0; i < ahor.getLongitud(); i++) {
                if (ahor.getPalabra_secreta()[i]==ahor.getLetra()) {
                    System.out.println("La letra ingresada se encuentra en la posición " + (i+1)+" de la palabra secreta");
                          cont++; 
                          letrasIngresadas[cont]=ahor.getPalabra_secreta()[i];
                }            }
        }
        ahor.setCant_letras(ahor.getCant_letras()+cont);
        mostrarPalabra(ahor);
    }
    public String mostrarPalabra(Ahorcado ahor){
        char[] pal = new char[ahor.getLongitud()];
            for (int i = 0; i < ahor.getLongitud(); i++) {
                for (int j = 0; j < letrasIngresadas.length; j++) {                    
                if (ahor.getPalabra_secreta()[i]==letrasIngresadas[j]) {
                    if (letrasIngresadas[j]!=palabraVacia[i]) {
                        palabraVacia[i]=ahor.getPalabra_secreta()[i];
                    }               }            }}
            for (int k = 0; k < ahor.getLongitud(); k++) {
            pal[k]= palabraVacia[k];
        }
           String mostrar= Arrays.toString(pal).toUpperCase();
        System.out.println(mostrar);
 return mostrar;
}
   /* Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
     public void encontradas(Ahorcado ahor){
         char letra = ahor.getLetra();
           boolean ban =  ahor.getPalabra().contains(String.valueOf(letra));
        if (ban == true){
            System.out.println(ban+" ¡Descubriste una letra! Tenes otra oportunidad.\n");
                }else{
            System.out.println(ban+ " La letra ingresada no está en la palabra secreta. Perdés una oportunidad.\n");
            ahor.setCant_intent(ahor.getCant_intent()-1);
     }
        System.out.println("Han sido encontradas :" + ahor.getCant_letras()+" letras.");
         System.out.println("Le falta descubrir: "+ (ahor.getLongitud()-ahor.getCant_letras())+" letras.\n");
       
     }
     //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
   public void intentos(Ahorcado ahor){
       System.out.println("Te quedan "+ ahor.getCant_intent()+ " intentos para descubrir la palabra secreta.\n");
   }
     /*Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
     
     public void juego(Ahorcado ahor){
         do{
        this.longitud(ahor);
        this.buscar(ahor,cont);
        this.encontradas(ahor);
        this.intentos(ahor);
             if (ahor.getCant_letras() == ahor.getLongitud()) {
                 System.out.println("¡FELICITACIONES! Descubriste la palabra secreta: ");
                 mostrarPalabra(ahor);
                  break;
             }
         }while(ahor.getCant_intent()>0);
         if (ahor.getCant_letras() != ahor.getLongitud()) {
             System.out.println("Lamentablemente se agotaron los intentos.No pudiste descubrir la palabra secreta.");
             mostrarPalabra(ahor);
         }          
     }
    
}
