
package Main;

import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class AnimalMain {


    public static void main(String[] args) {
       
        Perro p = new Perro("Pancho",3,"Pollo","Beagle");
        Gato g = new Gato("Paquita",6,"Atun","Pichuchu");
        Caballo c = new Caballo("Spirit",7,"Alfalfa","Pura Sangre");
        
        
        System.out.println(" ---- Nuestros Animales se alimentan de ----- ");
        p.alimentarse();
        System.out.println("-------------");
        g.alimentarse();
        System.out.println("-------------");       
        c.alimentarse();
        
    }
    
}
