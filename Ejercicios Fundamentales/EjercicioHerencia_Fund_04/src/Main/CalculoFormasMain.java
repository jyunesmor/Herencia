
package Main;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Servicios.servicioCirculo;
import Servicios.servicioRectangulo;
import Utilidades.CalculoFormas;

public class CalculoFormasMain {


    public static void main(String[] args) {

        servicioCirculo sc = new servicioCirculo();
        servicioRectangulo sr = new servicioRectangulo();
        Rectangulo r = new Rectangulo();
        Circulo c = new Circulo();
      
        c = sc.crearCirculo();
        Double area = c.calculoArea();
        Double perimetro = c.calculoPerimetro();
        System.out.println("");      
        System.out.println(" El Area del Circulo es de: " + area + 
                ", y su Perimetro es de: " + perimetro +" ml.");
        
        System.out.println("");
        r = sr.crearRectangulo();
        area = r.calculoArea();
        perimetro = r.calculoPerimetro();
        System.out.println("");      
        System.out.println(" El Area del Circulo es de: " + area + 
                " m2, y su Perimetro es de: " + perimetro + " ml.");
        
    }
   
}
