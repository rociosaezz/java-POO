
package Service;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionService {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
 //crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
 public Operacion crearOperacion() {
     System.out.println("Ingrese dos números");
Integer n1 = leer.nextInt();
Integer n2 = leer.nextInt();
     return new Operacion(n1, n2);
 }
 //sumar(): calcular la suma de los números y devolver el resultado al main.
 public int sumar(Operacion num1, Operacion num2){
     Integer suma = num1.getNum1()+ num2.getNum2();
     System.out.println("Se suma el número: "+ num1.getNum1()+" + el número: "+ num2.getNum2() +" . El resultado es: "+suma);     
     return suma;
 }
 //restar(): calcular la resta de los números y devolver el resultado al main
 public int restar(Operacion num1, Operacion num2) {
    Integer resta = num1.getNum1()- num2.getNum2();
    System.out.println("Se resta el número: "+ num1.getNum1()+" al número: "+ num2.getNum2() +" . El resultado es: "+resta);     
     return resta;
}
 // Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
 
 public int multiplicar(Operacion num1, Operacion num2){
     if (num2.getNum2() == 0 || num1.getNum2() == 0) {
         System.out.println("ERROR: si multiplica por '0' el resultado será '0'");
         return 0;
     }else{
         System.out.println("Se realizará la multiplicación del número: " + num1.getNum1() + " y el número: " + num2.getNum2());
     int multiplicacion = num1.getNum1() * num2.getNum2();
     return multiplicacion;            
     }
 }
 //Método dividir(): primero valida que no se haga una división por cero, si
 public double dividir(Operacion num1, Operacion num2){
     if (num2.getNum2() == 0 || num1.getNum2() == 0) {
         System.out.println("ERROR: si divide por '0' el resultado será '0'");
         return 0;
     }else{
         System.out.println("Se realizará la división del número: " + num1.getNum1() + " por el número: " + num2.getNum2());
     int division = num1.getNum1() / num2.getNum2();
     return division;            
     } 
 }
 
}
