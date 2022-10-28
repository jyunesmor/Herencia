package Main;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicio.servicioElectrodomesticos;
import Servicio.servicioLavadora;
import Servicio.servicioTelevisor;
import java.util.ArrayList;
import java.util.Scanner;

public class MainElectrodomesticos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioLavadora sl = new servicioLavadora();
        servicioTelevisor st = new servicioTelevisor();
        servicioElectrodomesticos se = new servicioElectrodomesticos();
        Electrodomesticos e = new Electrodomesticos();
        ArrayList<Lavadora> lav = new ArrayList<>();
        ArrayList<Televisor> tel = new ArrayList<>();
        ArrayList<Electrodomesticos> electro = new ArrayList<>();
        
//        Integer v = se.comprobarConsumoEnergetico('c');
//        System.out.println(v);
//        System.out.println("");
//        Integer s = se.valorPorPeso(65);
//        System.out.println(s);
//        System.out.println("");
//        String c = se.comprobarColor("rojo");
//        System.out.println(c);
//        System.out.println("");
//        Integer ca = se.ValorPorCarga(20);
//        System.out.println(ca);
     
        boolean flag = false;

        do {
            System.out.println("");
            System.out.println(" --- Crear Electrodomesticos ---".toUpperCase());
            System.out.println("");
            System.out.println(" Que electrodomestico desea crear :");
            System.out.println(" 1. Lavadora");
            System.out.println(" 2. Televisor");
            System.out.println(" 3. Mostrar Electrodomesticos");
            System.out.println(" 4. Salir");
            System.out.println("");
            int op = leer.nextInt();

            switch (op) {
                case 1:
                    Lavadora l = sl.crearLavadora();
                    lav.add(l);
                    electro.addAll(lav);
//                    flag = se.continuarCarga();
//                    sl.mostrarListadoLavadora(lav);
                    break;
                case 2:
                    Televisor t = st.crearTelevisor();
                    tel.add(t);
                    electro.addAll(tel);
//                    flag = se.continuarCarga();
//                    st.mostrarListadoTelevisor(tel);
                    break;
                case 3:
                    se.mostrarElectro(electro);
                    se.mostrarPrecioElectro(electro);
                    break;
                case 4:
                    flag = true;
                    break;
                default:
                    System.out.println(" La opcion seleccionada no es correcta");
                    System.out.println("");
            }
        } while (flag != true);
    } 
} // Fin Clase Main Electrodomesticos
