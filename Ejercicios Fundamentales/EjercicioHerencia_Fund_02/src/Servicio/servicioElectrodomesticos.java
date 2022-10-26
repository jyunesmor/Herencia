package Servicio;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import Utilidades.Colores;
import Utilidades.ConsumoEnergetico;
import static java.lang.Character.toUpperCase;
import java.util.ArrayList;
import java.util.Scanner;

public class servicioElectrodomesticos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Lavadora> lav = new ArrayList<>();
    ArrayList<Televisor> tel = new ArrayList<>();
    Electrodomesticos e = new Electrodomesticos();
    servicioLavadora sl = new servicioLavadora();
    servicioTelevisor st = new servicioTelevisor();
    

    public Integer comprobarConsumoEnergetico(Character letra) {
        Character l = toUpperCase(letra);
        Integer valor = 0;
        if (l >= 65 && l <= 70) {
            l = l;
        } else {
            l = 'F';
        }
        ConsumoEnergetico[] consumo = ConsumoEnergetico.values(); // Uso Enum Consumo Energetico
        for (int i = 0; i < consumo.length; i++) {
            String le = String.valueOf(l);
            if (consumo[i].name().equalsIgnoreCase(le)) {
                valor = consumo[i].getPrecio_por_consumo();
            }
        }
        return valor;
    }// Funciona

    public String comprobarColor(String color) {
        String colores = " ";
        Colores [] c = Colores.values();
        for (int i = 0; i < c.length; i++) {
            if (c[i].name().equalsIgnoreCase(color)) {
                colores = c[i].name();
            } else {
                colores = "BLANCO";
            }
        }
        return colores;
    } // Funciona

    public Integer valorPorCarga(Integer peso) {
        Integer valor = 0;
        if (peso >= 1 && peso <= 19) {
              return valor = 100;
        } else if (peso >= 20 && peso <= 49) {
              return valor = 500;
        } else if (peso >= 50 && peso <= 79) {
              return valor = 800;
        } else if (peso >= 80) {
              return valor = 1000;
        } else {
            return valor;
        }
    } // Funciona

    public void crearElectrodomestico() {

        boolean flag = false;

        do {
            System.out.println(" Crear Electrodomesticos ".toUpperCase());
            System.out.println("");
            System.out.println(" Que electrodomestico desea crear :");
            System.out.println(" 1. Lavadora");
            System.out.println(" 2. Televisor");
            System.out.println(" 3. Salir");
            int op = leer.nextInt();

            switch (op) {
                case 1:
                    Lavadora l = sl.crearLavadora();
                    lav.add(l);
                    flag = continuarCarga();
                    mostrarListadoLavadora(lav);
                    break;
                case 2:
                    Televisor t = st.crearTelevisor();
                    tel.add(t);
                    flag = continuarCarga();
                    break;
                case 3:
                    flag = true;
                    break;
                default:
                    System.out.println(" La opcion seleccionada no es correcta");
            }
        } while (flag != true);
    }

    public Integer precioFinal() {
        Integer precio_final;
        return precio_final = e.getPrecio();
    }

    public boolean continuarCarga() {
        boolean flag = false;
        System.out.println(" ¿Desea continuar la carga? ");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("n")) {
            flag = true;
        }
        return flag;
    }

    public void mostrarListadoLavadora(ArrayList<Lavadora> lav) {

        for (Lavadora lavadora : lav) {
            System.out.println(lavadora);
        }

    }

}
