
package Servicio;

import Entidad.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;


public class servicioCirculo {
    
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo c = new Circulo();
        DecimalFormat df = new DecimalFormat("#.000");
        
    public void CargarCirculo(){
        System.out.println(" Ingrese el Radio del Circulo a calcular: ");
        c.setRadio(leer.nextDouble());
        System.out.println(" Ingrese el Diametro del Circulo: ");
        c.setDiametro(leer.nextDouble());
    }    
    
    public void mostrarAreaPerimetro(){
        System.out.println(" El area del Circulo Ingresado es: " + df.format(c.calculoArea())+ " m2.-");
        System.out.println("");
        System.out.println(" El Perimetro del Circulo Ingresado es: " + df.format(c.calculoPerimetro()) + " ml.-");
    }
    
}
