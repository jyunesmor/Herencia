/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class servicioRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo r = new Rectangulo();
    DecimalFormat df = new DecimalFormat("#.000");
    
    public void CargarRectangulo() {
        System.out.println(" Ingrese la base del Rectángulo a calcular: ");
        r.setBase(leer.nextDouble());
        System.out.println(" Ingrese la altura del Rectángulo: ");
        r.setAltura(leer.nextDouble());
    }

    public void mostrarAreaPerimetro() {
        System.out.println(" El area del Rectángulo Ingresado es: " + df.format(r.calculoArea()) + " m2.-");
        System.out.println("");
        System.out.println(" El Perimetro del Rectángulo Ingresado es: " + df.format(r.calculoPerimetro())  + " ml.-");
    }

}
