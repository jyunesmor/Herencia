/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import Servicio.servicioEdificioDeOficina;
import Servicio.servicioMain;
import Servicio.servicioPolideportivo;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class EdificioMain {

    public static void main(String[] args) {

        
    servicioMain sm = new servicioMain(); 
    servicioEdificioDeOficina se = new servicioEdificioDeOficina();
    servicioPolideportivo sp = new servicioPolideportivo();
    EdificioDeOficinas ep = new EdificioDeOficinas();  
    DecimalFormat df = new DecimalFormat("#.00");
    
    ArrayList<EdificioDeOficinas> eo = se.crearEdifOfi();
    ArrayList<Polideportivo> p = sp.crearEdifPoli();
    ArrayList<Edificio> e = sm.crearEdif(eo,p);
      
      
//      sm.mostrarEdificios(e);
        se.cantPersonasPiso(eo);
        se.cantPersonasEdificio(eo);
//        sp.mostrarEdiftecha(p);
for (Edificio a : e) {
            System.out.println("La Superficie del Edificio es de "
                    + df.format(a.calcularSuperficie()) + " m2");
            System.out.println("El Volumen del Edificio es de "
                    + df.format(a.calcularVolumen()) + " m3");  
        }
        
    }

}
