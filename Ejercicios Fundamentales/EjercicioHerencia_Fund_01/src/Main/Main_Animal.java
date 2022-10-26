
package Main;

import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Main_Animal {

    public static void main(String[] args) {
     
        
        Perro p = new Perro("Tincho","Balanceado",2,"Caniche");
        Perro p1 = new Perro("Gaspar","Costilla",4,"Pastor Aleman");
        Gato g = new Gato("Lito","Atun",3,"Casa");
        Caballo c = new Caballo("Superman","Alfalfa",5,"Salvaje");
        
        
        p.alimentarse();
        System.out.println("--- --- --- --- --- ---");
        p1.alimentarse();
        System.out.println("--- --- --- --- --- ---");
        g.alimentarse();
        System.out.println("--- --- --- --- --- ---");
        c.alimentarse();
        System.out.println("--- --- --- --- --- ---");



    }
    
}
