
package Servicio;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;

import java.util.Scanner;


public class servicioLavadora extends servicioElectrodomesticos {
    
   
        Electrodomesticos e = new Electrodomesticos();

        
    public Lavadora crearLavadora() {
        System.out.println(" --- Carga de Lavadora ---".toUpperCase());
        System.out.println("");
        System.out.println(" Ingrese el Color de la Lavadora que desea: "); // Obtener color
        String color = leer.next();
        String c = comprobarColor(color);
        System.out.println(" Ingrese la carga que tendra la misma: "); // Obtener Carga
        Integer carga = leer.nextInt();
        Integer val_carga = valorPorCarga(carga);
        System.out.println(" Ingrese el tipo de Consumo que desea tener: "); // Obtener Consumo en Caracter
        Character letra = leer.next().charAt(0);
        Integer val_cons = comprobarConsumoEnergetico(letra);
        Integer val_Final = precioFinal(val_cons, carga);
        System.out.println(" Ingrese el peso de la Lavadora: "); // Obtener peso de la Lavadora
        Integer peso = leer.nextInt();

     
        Lavadora l = new Lavadora(carga,e.getPrecio(),c,letra,peso);
        return l;
    }

 
    public Integer precioFinal(Integer cons, Integer peso) {
        return (e.getPrecio() + cons + peso); 
    }

    
    
    
}
