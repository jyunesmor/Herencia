
package Servicio;

import Entidades.Electrodomesticos;
import Entidades.Televisor;
import java.util.ArrayList;



public class servicioTelevisor extends servicioElectrodomesticos {

    Electrodomesticos e = new Electrodomesticos();
  
    public Televisor crearTelevisor() {
        boolean sintonizador = false;
       
        e = super.crearElectrodomestico();
        System.out.println(" Ingrese las pulgadas del televisor: ");
        Integer pulgadas = leer.nextInt();
        System.out.println(" Ingrese si tiene sintonizador: ");
        String resp= leer.next();
        if (resp.equalsIgnoreCase("s")) {
            sintonizador = true;
        }
        Integer v = precioFinal(pulgadas,sintonizador);
        e.setPrecio(v);
        Televisor t = new Televisor(pulgadas,sintonizador,e.getPrecio(),e.getColor(),e.getConsumo(),e.getPeso());
        e.setPrecio(1000);
        return t;
        
    }
    
    public Integer precioFinal(Integer pulgadas, boolean sintonizador) {
        Integer val_carga = 0;
        Integer val_sint = 0;
        if (pulgadas > 40) {
            val_carga = (e.getPrecio()*30)/100;
        }
        if (sintonizador == true) {
            val_sint = 500;
        }
        return (super.precioFinal()+val_carga+val_sint);
    }

    public void mostrarListadoTelevisor(ArrayList<Televisor> tel) {

        for (Televisor televisor : tel) {
            System.out.println(televisor);
        }

    }
}
