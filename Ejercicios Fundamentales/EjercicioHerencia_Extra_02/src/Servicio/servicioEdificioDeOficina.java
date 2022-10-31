/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.EdificioDeOficinas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class servicioEdificioDeOficina {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EdificioDeOficinas e = new EdificioDeOficinas();

    public ArrayList<EdificioDeOficinas> crearEdifOfi() {
        //  Creamos los Edificios de Oficina
        ArrayList<EdificioDeOficinas> lista_eo = new ArrayList<>();
        EdificioDeOficinas eo = new EdificioDeOficinas(10, 5, 10, 10.5, 31.0, 20.8);
        EdificioDeOficinas eo1 = new EdificioDeOficinas(12, 30, 4, 8.9, 24.6, 35.7);
        EdificioDeOficinas eo2 = new EdificioDeOficinas(8, 45, 6, 8.9, 24.6, 35.7);
        EdificioDeOficinas eo3 = new EdificioDeOficinas(9, 28, 12, 25.9, 30.6, 25.7);

        lista_eo.add(eo);
        lista_eo.add(eo1);
        lista_eo.add(eo2);
        lista_eo.add(eo3);

        return lista_eo;
    }

    public void cantPersonasPiso(ArrayList<EdificioDeOficinas> eo) {
        Integer cant_per_piso = 0;
        Integer c = 1;
        for (EdificioDeOficinas a : eo) {
            cant_per_piso = a.getN_ofi()* a.getN_pers_of();
            System.out.println(" La Cantidad de Personas en el Piso " + c + " es de: " + cant_per_piso + " personas.");
            c++;
        }
    }

    public void cantPersonasEdificio(ArrayList<EdificioDeOficinas> eo) {
        Integer cant_per_edi = 0;
        Integer c = 1;
        for (EdificioDeOficinas a : eo) {
            cant_per_edi = a.getN_pers_of() * a.getN_ofi() * a.getN_pisos();
            System.out.println(" La Cantidad de Personas en el Edificio " + c + " es de: " + cant_per_edi + " personas.");
            c++;
        }
    }

    
}
