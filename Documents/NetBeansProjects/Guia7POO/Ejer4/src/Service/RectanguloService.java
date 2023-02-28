
package Service;

import Entidades.Rectángulo;
import java.util.Scanner;

public class RectanguloService {
    
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //método para crear el rectángulo con los datos del Rectángulo dados por el usuario

    public Rectángulo crearRectangulo(){
       Rectángulo rec = new Rectángulo();
        System.out.println("Ingrese la base en centímetros");
        rec.setBase(leer.nextInt());
         System.out.println("Ingrese la altura en centímetros");
        rec.setAltura(leer.nextInt());
        return rec;
    }
    // método para calcular la superficie del rectángulo 
 public int superficie(Rectángulo base, Rectángulo altura){
     int superf = base.getBase() * altura.getAltura();
     
     return superf;
 }   
 //y un método para calcular el perímetro del rectángulo
 public int perimetro (Rectángulo base, Rectángulo altura){
     int perimetro = (base.getBase() + altura.getAltura())*2;
     
     return perimetro;
 }
 //método que dibujará el rectángulo mediante asteriscos usando la base y la altura
 public void dibujarRectangulo(Rectángulo base, Rectángulo altura){
     for (int fila = 1; fila <= altura.getAltura(); fila++) {
     for (int columna = 1; columna <= base.getBase(); columna++) {
         
      if (fila == 1 || fila==altura.getAltura() || columna ==1 || columna == base.getBase()) {
             System.out.print("* ");
      }else{
          System.out.print("  "); }
     }
         System.out.print("\n");
     }
 }     
}
