
import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        
        Animal a = new Animal();
        Perro p = new Perro(5,"Jacobo");
        Gato g = new Gato(3,"Hermes");

        ArrayList <Animal> masco = new ArrayList<>();
        
        masco.add(a);
        masco.add(p);
        masco.add(g);
        
        for (Animal animal : masco) {
            System.out.println(animal);
        }
        System.out.println("------------");               
        a.hacerRuido();
        System.out.println("------------");
        p.hacerRuido();
        System.out.println("------------");
        g.hacerRuido();
        
    }
    
}
