
package Service;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServiceCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public Cafetera llenarCafetera(){
    int capacidadMax = 1000;
    return new Cafetera(capacidadMax, capacidadMax);
    }
    /*• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
    public int servirTaza (Cafetera capacidadMaxima, Cafetera cantidadActual){
        System.out.println("¿De qué tamaño es la taza que desea servir? (en mililitros)");
        int tamaño = leer.nextInt();
        while (tamaño>cantidadActual.getCantidadActual()) {
            System.out.println("La cantidad actual de café no alcanza para llenar la taza, se servirá lo que queda: "+cantidadActual.getCantidadActual()+" ml. por lo que no queda su taza llena.");
            cantidadActual.setCantidadActual(0);
        break;
        }
        if (tamaño<=cantidadActual.getCantidadActual()){
            System.out.println("Se llenará su taza con "+tamaño+" ml.de café. \n ¡Taza llena!");
            cantidadActual.setCantidadActual(cantidadActual.getCantidadActual()-tamaño);
        }        
        return tamaño;
    }
   //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cantidadActual){
        cantidadActual.setCantidadActual(0);
        System.out.println("Su cafetera ahora está vacía.");
    }
/*• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
    public int agregarCafe(Cafetera capacidadMaxima, Cafetera cantidadActual){
        System.out.println("¿Cuánto café desea agregar?");
        int cantidad = leer.nextInt();
      
        while (cantidad > capacidadMaxima.getCapacidadMaxima()- cantidadActual.getCantidadActual()) {
            System.out.println("El café ingresado más la cantidad existente exceden la capacidad de la cafetera, ingrese menos de "+ (capacidadMaxima.getCapacidadMaxima()-cantidadActual.getCantidadActual()) +"\n Ingrese cuánto desea ingresar: ");
        cantidad = leer.nextInt();
            if (cantidad<capacidadMaxima.getCapacidadMaxima()-cantidadActual.getCantidadActual()) {
                cantidadActual.setCantidadActual(cantidadActual.getCantidadActual()+cantidad);
                System.out.println("Se han cargado "+cantidad+" ml. de café");
                break;
            }        
        }
        if  (cantidad<capacidadMaxima.getCapacidadMaxima()-cantidadActual.getCantidadActual()){
                cantidadActual.setCantidadActual(cantidadActual.getCantidadActual()+cantidad);
                        }
         cantidadActual.setCantidadActual(cantidadActual.getCantidadActual()+cantidad);
        System.out.println("Café cargado exitosamente. Ahora su cafetera tiene: "+cantidadActual.getCantidadActual());
        return cantidad;
    }
    public void menu(Cafetera cafe){
                Scanner leer = new Scanner(System.in);
        int opt =1;
        do{
        System.out.println("Ingrese el número de la opción que desea: "+"\n"+"1. Servir taza"+"\n"+"2. Vaciar Cafetera"+"\n"+"3. Llenar Cafetera");
        opt = leer.nextInt();
            while (opt>3 || opt<1) {
                System.out.println("Ingrese una opción válida o ingrese 0 para salir");
                opt = leer.nextInt();
                if (opt ==0) {
                    System.out.println("Gracias por elegir Nespresso.");                    
                }break;} 
        switch(opt){            
            case 1:                 servirTaza(cafe, cafe);
                continue;
            case 2:               vaciarCafetera(cafe);
                continue;
            case 3:                agregarCafe(cafe, cafe);
        }
        }while(opt>0 && opt< 4);    
    }
}
