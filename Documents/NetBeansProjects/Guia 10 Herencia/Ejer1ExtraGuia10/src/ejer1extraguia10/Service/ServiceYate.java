/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1extraguia10.Service;

import ejer1extraguia10.Entidades.Alquiler;
import ejer1extraguia10.Entidades.Yate;

/**
 *
 * @author Rocio
 */
public class ServiceYate extends ServiceBarcoAMotor {

    public Integer calcularAlquiler(Alquiler a, Yate ya) {
        
        return super.calcularAlquiler(a)+ya.getCamarotes(); 
        
    
    }
    
}
