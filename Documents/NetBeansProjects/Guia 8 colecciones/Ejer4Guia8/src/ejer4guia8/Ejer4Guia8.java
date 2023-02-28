/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4guia8;

import Entidades.Pelicula;
import Service.ServicePelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ejer4Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Pelicula> listaPeliculas = new ArrayList ();
        ServicePelicula ps = new ServicePelicula();
        
        
       
        ps.llenarLista(listaPeliculas);
        ps.mostrarLista(listaPeliculas);
        ps.pelisMayorHora(listaPeliculas);
        ps.ordenMayorMenor(listaPeliculas);
        ps.ordenMenorMayor(listaPeliculas);
        ps.ordenTitulo(listaPeliculas);
        ps.ordenDirector(listaPeliculas);
    }
    
}
