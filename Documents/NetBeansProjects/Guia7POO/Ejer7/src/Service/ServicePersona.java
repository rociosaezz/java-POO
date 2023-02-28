package Service;

import Entidades.Persona;
import java.util.Scanner;

public class ServicePersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje*/
    public Persona crearPersona(){
        Persona prs = new Persona();
        boolean bandera= true;
        System.out.print("BIENVENIDO AL CALCULADOR DE ÍNDICE DE MASA CORPORAL\nIngrese su nombre: ");
prs.setNombre(leer.next());
        System.out.print("Ingrese su edad: ");
        prs.setEdad(leer.nextInt());
        do{
System.out.print("Ingrese su sexo (H: hombre, M: mujer, O:otro): ");
prs.setSexo(leer.next());
       if (prs.getSexo().equalsIgnoreCase("O") || prs.getSexo().equalsIgnoreCase("M") || prs.getSexo().equalsIgnoreCase("H")) {
                bandera = false;
            } else {
                System.out.println("Solo se admiten alguna de las tres opciones (\"O\", \"M\" o \"H\")");
            }
        } while (bandera);
        System.out.print("Ingrese su peso: ");
       prs.setPeso(leer.nextDouble());
        System.out.print("Ingrese su altura: ");
        prs.setAltura(leer.nextDouble());        
   
        return prs; }
    /*• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    public int calcularIMC(Persona prs){
        double  pesoIdeal = prs.getPeso()/(Math.pow(prs.getAltura(), 2));
        int ret = 0;
        if (pesoIdeal<20) {
            System.out.println(prs.getNombre()+ " se encuentra por debajo de su peso ideal.");
            ret = -1;
        }
         if (pesoIdeal>=20 && pesoIdeal<=25) {
            System.out.println(prs.getNombre()+ " se encuentra en su peso ideal.");
            ret = 0;
        } 
         if (pesoIdeal>25) {
            System.out.println(prs.getNombre()+ " se encuentra por encima de su peso ideal. Tiene sobrepeso.");
            ret = 1;
        }
        return ret;
    }
    
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
 public boolean esMayorDeEdad(Persona prs) throws PersonaException{
     try{
            if (prs.getEdad()==0) {
            throw new PersonaException("La edad de "+prs.getNombre()+" no puede estar en cero" );
            
         }
      if (prs.getEdad()>=18){         
         System.out.println(prs.getNombre()+" es mayor de edad.");
         
         return true;
     }else if(prs.getEdad()>0 && prs.getEdad()>18)
      System.out.println(prs.getNombre() + " es menor de edad");
        return false;
     }catch(PersonaException e){
         throw e;
     }
     
     }
}

