
package ejer5;

import Entidades.Cuenta;
import Service.CuentaService;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaService C1 = new CuentaService();
        Cuenta banking = C1.crearCuenta();
        int opt =1;
        do{
        System.out.println("Ingrese el número de la opción que desea: "+"\n"+"1. Ingresar dinero"+"\n"+"2. Extraer dinero"+"\n"+"3. Método de extracción rápida"+"\n"+"4. Consultar saldo"+"\n"+ "5. Mostrar datos de la cuenta");
        opt = leer.nextInt();
            while (opt>5 || opt<1) {
                System.out.println("Ingrese una opción válida o ingrese 0 para salir");
                leer.nextInt(opt);
                if (opt ==0) {
                    System.out.println("Gracias por elegirnos.");
                    break;
                }} 
        switch(opt){            
            case 1:                 C1.ingresar(banking);
                continue;
            case 2:                C1.retirar(banking);
                continue;
            case 3:                C1.extraccionRapida(banking);
                continue;
            case 4:                C1.consultarSaldo(banking);
               continue;
            case 5:                C1.consultarDatos(banking, banking, banking);
                     
        }
        }while(opt>0 && opt< 6);             
}}