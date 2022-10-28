
package Servicio;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import java.util.ArrayList;


public class servicioLavadora extends servicioElectrodomesticos {

    public Lavadora crearLavadora() {
        Electrodomesticos e = new Electrodomesticos();
        e = super.crearElectrodomestico();
        System.out.println(" Ingrese la carga que tendra la misma: "); // Obtener Carga
        Integer carga = leer.nextInt();
        Integer v = precioFinal(carga);
        e.setPrecio(v);
        Lavadora l = new Lavadora(carga,e.getPrecio(),e.getColor(),e.getConsumo(),e.getPeso());
        e.setPrecio(1000);
        return l;
    }

    public Integer precioFinal(Integer carga) {
        Integer val_carga = 0;
        if (carga > 30) {
            val_carga = 500;
        }
        return (super.precioFinal()+val_carga);
    }

   public void mostrarListadoLavadora(ArrayList<Lavadora> lav) {

        for (Lavadora lavadora : lav) {
            System.out.println(lavadora);
        }

    }


    
    
    
}
