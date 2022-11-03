/*

 */
package Entidad;

/**
 *
 * @author Juan
 */
public class Velero extends Barco {

      private Integer n_mastiles;

    public Velero() {
    }
   
    public Velero(Integer n_mastiles, String matricula, Integer eslora, Integer anio_fabricacion, boolean alquilado) {
        super(matricula, eslora, anio_fabricacion, alquilado);
        this.n_mastiles = n_mastiles;
    }

    public Integer getN_mastiles() {
        return n_mastiles;
    }

    public void setN_mastiles(Integer n_mastiles) {
        this.n_mastiles = n_mastiles;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Velero{"  + super.toString() + "n_mastiles=" + n_mastiles + '}';
    }
    
    
      
}
