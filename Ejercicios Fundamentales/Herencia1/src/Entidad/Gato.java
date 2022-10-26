package Entidad;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, Integer edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(" Soy un Gato llamado " + getNombre() + " y como: " + getAlimento());
    }

}
