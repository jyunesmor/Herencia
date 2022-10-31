/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class servicioMain {

    servicioEdificioDeOficina se = new servicioEdificioDeOficina();
    servicioPolideportivo sp = new servicioPolideportivo();
    ArrayList<Edificio> lista = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#.00");

    ArrayList<EdificioDeOficinas> eo = se.crearEdifOfi();
    ArrayList<Polideportivo> pol = sp.crearEdifPoli();
    
    public ArrayList<Edificio> crearEdif(ArrayList<EdificioDeOficinas> eo, ArrayList<Polideportivo> pol) {
        //  Cargamos el Array Edificio 
        ArrayList<Edificio> lista = new ArrayList<>();
        lista.addAll(eo);
        lista.addAll(pol);
        return lista;
    }

    public void mostrarEdificios(ArrayList<Edificio> lista) {
        for (Edificio aux : lista) {
            System.out.println("");
            System.out.println(aux.toString());
            System.out.println("La Superficie del Edificio es de "
                    + df.format(aux.calcularSuperficie()) + " m2");
            System.out.println("El Volumen del Edificio es de "
                    + df.format(aux.calcularVolumen()) + " m3");
        }
    }
   
    
}
