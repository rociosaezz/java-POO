
package Service;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaService {
    
    Scanner leer = new Scanner (System.in);
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    
    
    public Cuenta crearCuenta(){
        
        Cuenta cnt = new Cuenta();
        
        System.out.println("Ingrese su número de cuenta");
        cnt.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cnt.setDni(leer.next());
        
        return cnt;
    }
    /*Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.*/
    public double ingresar(Cuenta SaldoActual){
       System.out.println("¿Cuánto dinero desea ingresar?");
         double ingreso= leer.nextInt();
         ingreso = ingreso + SaldoActual.getSaldoActual();
        SaldoActual.setSaldoActual(ingreso);
        System.out.println("INGRESO EXITOSO"+"\n"+ "Su saldo actual es de: "+SaldoActual.getSaldoActual());
    return ingreso; 
    }
    
/* 
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
    */
    public double retirar(Cuenta SaldoActual){
        System.out.println("¿Cuánto dinero quiere retirar?");
        double retiro = leer.nextDouble();
        while (retiro>= SaldoActual.getSaldoActual()){
            System.out.println("Solo puede retirar: $"+SaldoActual.getSaldoActual()+"¿Desea retirar este dinero disponible? s/n");
            String opcionn = leer.next();
            if (opcionn.equalsIgnoreCase("s")) {
                System.out.println("OPERACIÓN EXITOSA. Ahora su saldo es de $0");
               SaldoActual.setSaldoActual(0);       
                } else if(opcionn.equalsIgnoreCase("n")){
            System.out.println("Entonces ingrese un monto menor para retirar");
            retiro = leer.nextDouble();
        }}
        SaldoActual.setSaldoActual(SaldoActual.getSaldoActual()-retiro);
      System.out.println("Ha retirado: $"+retiro+" . El saldo actual es de: "+SaldoActual.getSaldoActual());
          return retiro;  
         }
        
    
    /*
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
public double extraccionRapida(Cuenta SaldoActual){
        System.out.println("¿Cuánto dinero quiere retirar?");
        double extRapida = leer.nextDouble();        
        while (extRapida>(SaldoActual.getSaldoActual()*0.20)) {
            System.out.println("No puede retirar más del 20% de su saldo actual. Ingrese un monto menor.");            
        extRapida = leer.nextDouble();
        }
        SaldoActual.setSaldoActual(SaldoActual.getSaldoActual()-extRapida);
        System.out.println("Usted retiró:"+ extRapida);
        System.out.println("Su saldo actual es: "+ SaldoActual.getSaldoActual());
           return extRapida;
    }
/*g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
public Cuenta consultarSaldo(Cuenta saldoActual){
    System.out.println("¿Consultar saldo? s/n");
    String opcion = leer.next();
    if (opcion.equalsIgnoreCase("s")) {
        System.out.println("Su saldo actual es de: "+saldoActual.getSaldoActual());
    }else if (opcion.equalsIgnoreCase("n")){
        System.out.println("Salir");
    }else{
        System.out.println("No es una opción válida");
    }
    return saldoActual;
}

/*
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/
public Cuenta consultarDatos(Cuenta SaldoActual, Cuenta dni, Cuenta numeroCuenta){
            System.out.println("Sus datos son:"+"\n"+"Número de cuenta: "+numeroCuenta.getNumeroCuenta()+"\n"+"DNI: "+dni.getDni()+"\n"+"Su saldo actual es de:"+SaldoActual.getSaldoActual());     
return new Cuenta();
}
}

