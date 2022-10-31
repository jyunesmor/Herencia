/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class servicioPolideportivo {

    public ArrayList<Polideportivo> crearEdifPoli() {
        //  Creamos los Edificios Polideportivos
        ArrayList<Polideportivo> lista_pol = new ArrayList<>();
        Polideportivo p = new Polideportivo(true, "Casta Ñuela", 25.8, 15.0, 30.8);
        Polideportivo p1 = new Polideportivo(false, "Mante Col", 12.0, 20.8, 45.0);
        Polideportivo p2 = new Polideportivo(false, "Maña Nita", 9.5, 35.6, 30.0);
        Polideportivo p3 = new Polideportivo(false, "Lolla Palosa", 42.7, 30.6, 34.0);

        lista_pol.add(p);
        lista_pol.add(p1);
        lista_pol.add(p2);
        lista_pol.add(p3);

        return lista_pol;
    }

    public void mostrarEdiftecha(ArrayList<Polideportivo> p) {
        Integer c = 0;
        for (Polideportivo pol : p) {
            if (pol.getTipo_inst() == true) {
                c++;
            }
        }
        System.out.println(" La Cantidad de Polideportivos techados son: " + c + ".");
        System.out.println(" Los Mismos son: ");
        for (Polideportivo pol : p) {
            if (pol.getTipo_inst() == true) {
                System.out.println(pol.toString());
            }
        }
    }

}
