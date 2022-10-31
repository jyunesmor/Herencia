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

    Electrodomesticos e = new Electrodomesticos();  

    public Integer comprobarConsumoEnergetico(Character letra) {
        Character l = toUpperCase(letra);
        Integer valor = 0;
        if (l >= 65 && l <= 70) {
            e.setConsumo(l); 
        } else {
            e.setConsumo('F');
        }
        
        ConsumoEnergetico[] consumo = ConsumoEnergetico.values(); // Uso Enum Consumo Energetico
        for (int i = 0; i < consumo.length; i++) {
            String le = String.valueOf(l);
            if (consumo[i].name().equalsIgnoreCase(le)) {
                valor = consumo[i].getPrecio_por_consumo();
            }
        }
        return valor;
    }// Funciona Devuelve el Precio dependendiendo del Consumo

    public String comprobarColor(String color) {
        String colores = " ";
        Colores [] c = Colores.values();
        for (int i = 0; i < c.length; i++) {
            if (c[i].name().equalsIgnoreCase(color)) {
                colores = c[i].name();
                break;
            } else {
                colores = "BLANCO";
            }
        }
        e.setColor(colores);
        return colores;
    } // Funciona Devuelve el Color dependendiendo del Ingresado

    public Integer valorPorPeso(Integer peso) {
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
    } // Funciona Devuelve el Precio dependendiendo del Peso
    
    public Integer ValorPorCarga (Integer carga){
        Integer valor = 0;
        if (carga > 30) {
          valor = 500;
        }
        return valor;
    } // Funciona Devuelve el Precio dependendiendo la carga 

    public Electrodomesticos crearElectrodomestico() {
        System.out.println(" --- Carga del Electrodomestico ---".toUpperCase());
        System.out.println("");
        System.out.println(" Ingrese el Color del Electrodomestico que desea: "); // Obtener color
        System.out.println("");
        String color = leer.next();
        color = color.toUpperCase();
        String c = comprobarColor(color);
        System.out.println(" Ingrese el tipo de Consumo que desea tener: "); // Obtener Consumo en Caracter
        Character letra = leer.next().charAt(0);
        Character letra1 = toUpperCase(letra);
        Integer val_cons = comprobarConsumoEnergetico(letra1);
        e.setPrecio(e.getPrecio()+ val_cons);
        System.out.println(" Ingrese el peso del Electrodomestico: "); // Obtener peso de la Lavadora
        Integer peso = leer.nextInt();
        Integer val_peso = valorPorPeso(peso);
        e.setPrecio(e.getPrecio()+val_peso);
        
        e = new Electrodomesticos(e.getPrecio(),c,letra1,peso);
        return e;
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
    
    public void mostrarElectro(ArrayList<Electrodomesticos> electro){
        
        for (Electrodomesticos e : electro) {
            System.out.println(e.toString());
        }
        
    }
    
    public void mostrarPrecioElectro(ArrayList<Electrodomesticos> electro){
        Integer precio_lav= 0;
        Integer precio_tel= 0;
        Integer precio_ele= 0;
        for (Electrodomesticos e : electro) {
//            precioFinal();
            precio_ele = precio_ele + e.getPrecio();
          if(electro.get(0) instanceof Lavadora)  // Determinar el valor de todas las Lavadoras
          { 
            precio_lav = precio_lav + electro.get(0).getPrecio();
          }
          if(electro.get(0) instanceof Televisor) // Determinar el valor de todos los Televisores
          {
            precio_tel = precio_tel + electro.get(0).getPrecio();
          }
        }
//        for (int i = 0; i < electro.size(); i++) {
//          if(electro.get(i) instanceof Lavadora)  // Determinar el valor de todas las Lavadoras
//          { 
//            precio_lav = precio_lav + electro.get(i).getPrecio();
//          }
//          if(electro.get(i) instanceof Televisor) // Determinar el valor de todos los Televisores
//          {
//            precio_tel = precio_tel + electro.get(i).getPrecio();
//          }
//        }
        System.out.println("");
        System.out.println(" El Valor de todos los Electrodomesticos es de: $ " + precio_ele);
        System.out.println(" El Valor de todas las Lavadoras es de: $ " + precio_lav);
        System.out.println(" El Valor de todos los Televisores es de: $ " + precio_tel);
    }
    
}
