
package Servicios;


import Entidades.Rectangulo;
import java.util.Scanner;


public class servicioRectangulo {
    
    /*Área rectángulo: base * altura / Perímetro rectángulo: (base + altura)*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo r;   
    
    
    public Rectangulo crearRectangulo(){
       
        System.out.println(" Ingrese la Base del Rectangulo deseado: ");
        Double base = leer.nextDouble();
        System.out.println("");
        System.out.println(" Ingrese la Altura del Rectangulo deseado: ");
        Double altura = leer.nextDouble();
        
        r= new Rectangulo(base, altura);
      
        return r;
    }
    
    
    
}
