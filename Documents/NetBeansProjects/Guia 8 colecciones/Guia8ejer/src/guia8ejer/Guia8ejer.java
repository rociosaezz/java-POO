/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Guia8ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> numerosA = new ArrayList();
    HashSet<String> numerosB = new HashSet();
    HashMap<Integer, String> personas = new HashMap();
    
        for (int i = 0; i < 5; i++) {
            
            int numA = i+1;
            String numB = " A";
            
            numerosA.add(numA);
            numerosB.add(numB);
            personas.put(i, numB);
            
        }
        
        System.out.println(numerosA + numerosB.toString() + personas.toString());
        System.out.println(numerosB.size());
        
        Scanner leer = new Scanner(System.in);
        
        
    /*ArrayList<Integer> numerosA = new ArrayList();
    HashSet<String> numerosB = new HashSet();
    HashMap<Integer, String> personas = new HashMap();*/
    
        for (int i = 0; i < 5; i++) {
            
            int numA = i+2;
            System.out.println("Ingrese un valor para numB");
            String numB = leer.next();
            
            numerosA.add(numA);
            numerosB.add(numB);
            personas.put(numA, numB);
           
        }
        
        System.out.println(numerosA + numerosB.toString() + personas.toString());
        System.out.println(numerosB.size());
        numerosA.remove(2);
        numerosB.remove("A");
        personas.remove(3);
        System.out.println(numerosA + numerosB.toString() + personas.toString());

        HashMap<Integer, String> personitas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";

        personitas.put(0, n1);
        personitas.put(1, n2);

        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object next() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       }
                ;
                
    
    }

    }