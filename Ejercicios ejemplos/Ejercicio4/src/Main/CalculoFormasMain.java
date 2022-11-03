
package Main;

import Servicio.servicioCirculo;
import Servicio.servicioRectangulo;


public class CalculoFormasMain {


    public static void main(String[] args) {
        
        
       servicioCirculo sc = new servicioCirculo();
       servicioRectangulo sr = new servicioRectangulo();
           
       sc.CargarCirculo();
       sc.mostrarAreaPerimetro();
       
       System.out.println("");
        
       sr.CargarRectangulo();
       sr.mostrarAreaPerimetro();
        
    }
    
}
