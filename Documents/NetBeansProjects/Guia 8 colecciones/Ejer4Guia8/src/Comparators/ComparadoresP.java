/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparators;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Rocio
 */
public class ComparadoresP {
 public static Comparator <Pelicula> ordenarMayorMenor = new Comparator <Pelicula> (){
     @Override
     public int compare(Pelicula t, Pelicula t1) {
         return t1.getDuracion().compareTo(t.getDuracion());
     };};
 public static Comparator <Pelicula> ordenarMenorMayor = new Comparator <Pelicula> (){
     @Override
     public int compare(Pelicula t, Pelicula t1) {
         return t.getDuracion().compareTo(t1.getDuracion());
     }
    
};
 public static Comparator <Pelicula> ordenarPorNombre = new Comparator <Pelicula> (){
     @Override
     public int compare(Pelicula t, Pelicula t1) {
         return t.getPelicula().toLowerCase().compareTo(t1.getPelicula().toLowerCase());
     };
};
public static Comparator <Pelicula> ordenarPorDirector = new Comparator <Pelicula> (){
     @Override
     public int compare(Pelicula t, Pelicula t1) {
         return t.getDirector().toLowerCase().compareTo(t1.getDirector().toLowerCase());
     };};}

