/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Servcio.servicioAlquiler;



/**
 *
 * @author Juan
 */
public class AlquilerBarcoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        servicioAlquiler sa = new servicioAlquiler();

        
        
      sa.crearBarco();
      sa.crearAlquiler();
  
      
        
        
        
        
    }
    
}
