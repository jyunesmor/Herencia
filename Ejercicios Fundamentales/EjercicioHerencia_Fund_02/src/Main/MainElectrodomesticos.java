
package Main;


import Entidades.Electrodomesticos;
import Servicio.servicioElectrodomesticos;

public class MainElectrodomesticos {


    public static void main(String[] args) {

        
        
        servicioElectrodomesticos se = new servicioElectrodomesticos();
        Electrodomesticos e = new Electrodomesticos();
        
//        Integer v = se.comprobarConsumoEnergetico('c');
//        System.out.println(v);
//        System.out.println("");
//        Integer s = se.valorPorCarga(65);
//        System.out.println(s);
//        System.out.println("");
//        String c = se.comprobarColor("VIOLETA");
//        System.out.println(c);
        
        se.crearElectrodomestico();
        
    }
    
}
