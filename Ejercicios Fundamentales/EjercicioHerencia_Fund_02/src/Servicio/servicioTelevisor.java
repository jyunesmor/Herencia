
package Servicio;

import Entidades.Electrodomesticos;

import Entidades.Televisor;

import java.util.Scanner;


public class servicioTelevisor extends servicioElectrodomesticos {
    

    Electrodomesticos e = new Electrodomesticos();
  
    public Televisor crearTelevisor() {
        boolean sintonizador = false;
        
        System.out.println(" --- Carga de Televisor ---".toUpperCase());
        System.out.println("");
        System.out.println(" Ingrese las pulgadas del televisor: ");
        Integer pulgadas = leer.nextInt();
        System.out.println(" Ingrese si tiene sintonizador: ");
        String resp= leer.next();
        if (resp.equalsIgnoreCase("s")) {
            sintonizador = true;
        }
        System.out.println(" Ingrese el color del televisor: ");
        String color= leer.next();
        System.out.println(" Ingrese el tipo de Consumo que desea tener: ");
        Character letra = leer.next().charAt(0);
        System.out.println(" Ingrese el peso del televisor: ");
        Double peso = leer.nextDouble();
     
        Televisor t = new Televisor(pulgadas,sintonizador,e.getPrecio(),color,letra,peso);
        return t;
        
    }
  
}
