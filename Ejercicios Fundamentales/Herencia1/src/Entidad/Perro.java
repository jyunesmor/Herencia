
package Entidad;


public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, Integer edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    @Override
    public void alimentarse() {
       System.out.println(" Soy un Perro llamado " + getNombre() + " y como: " + getAlimento());
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
  
    
}
