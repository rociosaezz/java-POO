package Service;

import Entidades.Matematica;

public class ServiceMatematica {
   
    public Matematica crearMat(){
        Matematica m = new Matematica();
         m.setNum1((float)Math.random()*10);
        m.setNum2((float)Math.random()*10);
        return m;
    }
     //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(Matematica m){
        double mayor;
        if (m.getNum1()> m.getNum2()) {
            mayor= m.getNum1();
            System.out.println("El primer número: " + m.getNum1()+ " es mayor al segundo número: "+m.getNum2());
        }else {
            mayor=m.getNum2();
                        System.out.println("El segundo número: " + m.getNum2()+ " es mayor al primer número: "+m.getNum1());
        }
        return mayor;
    }
/*b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. 
    Previamente se deben redondear ambos valores.*/
    public double calcularPotencia(Matematica m){
       int potencia;        
       //double mayor = this.devolverMayor(m);
        int num1= Math.round((float)m.getNum1());
        int num2= Math.round((float)m.getNum2());
        if (num1>num2) {
           potencia= (int)Math.pow(num1, num2); 
            System.out.println("Número mayor es el número 1, redondeado: "+num1);
            System.out.println("La potencia del 'número 1': "+num1+"  elevado al 'número 2': "+num2+"  es: "+potencia);
        }else {
            potencia=(int)Math.pow(num2, num1);
             System.out.println("Número mayor es el número 2, redondeado: "+num2);
                System.out.println("La potencia del 'número 2': "+num2+"  elevado al 'número 1': "+num1+"  es: "+potencia);
        }       
        return potencia;
    }
/*c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    public double calculaRaiz(Matematica m){
      double num1abs= Math.abs(m.getNum1());
      double num2abs= Math.abs(m.getNum2());
      double raiz; 
      if (num1abs<num2abs) {
           raiz= Math.sqrt(num1abs);
            System.out.println("La raíz del 'número 1': "+num1abs+ "  es: "+raiz);
        }else {
           raiz=Math.sqrt(num2abs);
                System.out.println("La raíz del 'número 2': "+ num2abs+"  es: "+raiz);
        }      
        return raiz;
    }
}

