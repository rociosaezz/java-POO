/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import static Comparators.ComparadoresP.ordenarMayorMenor;
import static Comparators.ComparadoresP.ordenarMenorMayor;
import static Comparators.ComparadoresP.ordenarPorDirector;
import static Comparators.ComparadoresP.ordenarPorNombre;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class ServicePelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pelicula nuevaPelicula(){
        Pelicula peli = new Pelicula();
         System.out.println("Ingrese el nombre de la Película");
        peli.setPelicula(leer.next());
        System.out.println("Ingrese el nombre del director de la Película");
        peli.setDirector(leer.next());
        System.out.println("Ingrese la duración de la Pelicula");
        peli.setDuracion(leer.nextDouble());
        return peli;
    }
    public void llenarLista(ArrayList <Pelicula> listaPeliculas){
          String op="S";
        do{         
            listaPeliculas.add(nuevaPelicula());
            System.out.println("Desea agregar otra pelicula S/N");
            op=leer.next();
            
        }while(op.equalsIgnoreCase("s"));
    }
    //Mostrar en pantalla todas las películas.
      public void mostrarLista(ArrayList <Pelicula> listaPeliculas){
          System.out.println("Películas agregadas: ");
          for (Pelicula listaPelicula : listaPeliculas) {
             System.out.println(listaPelicula.toString()); 
          }
          
}
      //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
      public void pelisMayorHora(ArrayList <Pelicula> listaPeliculas){
          System.out.println("\nPelículas con una duración mayor a 1 hora");
               for (Pelicula listaPelicula : listaPeliculas) {
                    if (listaPelicula.getDuracion() > 1) {
             System.out.println(listaPelicula.toString());              
          }
          }
      }
      //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.

      public void ordenMayorMenor(ArrayList <Pelicula> listaPeliculas){
          System.out.println("\nPelículas ordenadas de mayor a menor duración");
          Collections.sort(listaPeliculas, ordenarMayorMenor);
          mostrarLista(listaPeliculas);
      }
        //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
      public void ordenMenorMayor(ArrayList <Pelicula> listaPeliculas){
          System.out.println("\nPelículas ordenadas de menor a mayor duración");
          Collections.sort(listaPeliculas, ordenarMenorMayor);
          mostrarLista(listaPeliculas);
      }
      //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
      public void ordenTitulo(ArrayList <Pelicula> listaPeliculas) {
          System.out.println("\nPelículas ordenadas alfabéticamente por su título");
          Collections.sort(listaPeliculas, ordenarPorNombre);
          mostrarLista(listaPeliculas); 
      }      
        //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
          public void ordenDirector(ArrayList <Pelicula> listaPeliculas) {
          System.out.println("\nPelículas ordenadas alfabéticamente por su director");
          Collections.sort(listaPeliculas, ordenarPorDirector);
          mostrarLista(listaPeliculas); 
      }      
}
