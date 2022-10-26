package Entidad;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, Integer edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }
 
    @Override
    public void alimentarse() {
        System.out.println(" Soy un Caballo llamado " + getNombre() + " y como: " + getAlimento());
    }
}
