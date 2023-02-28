/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.Servicio;

import guia7.ejer1Libro;
import java.util.Scanner;


public class ejer1LibroService {
       public ejer1Libro NuevoLibro() {
        ejer1Libro L1 = new ejer1Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN:");
        L1.setISBN(leer.next());
        System.out.println("Ingrese el título:");
        L1.setTitulo(leer.next());
        System.out.println("Ingrese el autor:");
        L1.setAutor(leer.next());
           System.out.println("Ingrese la cantidad de páginas en números:");
        L1.setNumPag(leer.nextInt());
           return L1;
           
}
}
