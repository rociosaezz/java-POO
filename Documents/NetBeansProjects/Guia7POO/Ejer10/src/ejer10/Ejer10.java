/*el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.*/
package ejer10;

import java.util.Arrays;


public class Ejer10 {

    public static void main(String[] args) {        
   double [] arregloA = new double[50];
   double [] arregloB = new double[20];   
   //Arrays.fill(arregloA,1,50, Math.random()*100);
   for (int i = 0; i < arregloA.length; i++) {
           arregloA[i]= Math.random()*100;       
    }
        System.out.println("Arreglo A: \n"+Arrays.toString(arregloA));
       
        System.out.println("\nArreglo A ordenado: ");
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));
        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i]= arregloA[i];
        }
        System.out.println("\nArreglo B: \n"+Arrays.toString(arregloB));
}}
