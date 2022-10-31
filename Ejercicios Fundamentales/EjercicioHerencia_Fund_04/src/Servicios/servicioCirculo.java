
package Servicios;

import Entidades.Circulo;
import java.util.Scanner;

public class servicioCirculo {
    
    /*Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Circulo c;
    
    public Circulo crearCirculo(){
        
        System.out.println(" Ingrese el radio del Circulo deseado: ");
        Double radio = leer.nextDouble();
        System.out.println("");
        System.out.println(" Ingrese el diametro del Circulo deseado: ");
        Double diametro = leer.nextDouble();
        
        c= new Circulo(radio, diametro);
      
        return c;
        
    }
    
    
}
