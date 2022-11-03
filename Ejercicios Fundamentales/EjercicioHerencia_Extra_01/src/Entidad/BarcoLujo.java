
package Entidad;


public final class BarcoLujo extends BarcoMotor {

    private Integer n_camarotes_yates;

    public BarcoLujo() {
    }

    
    
    public BarcoLujo(Integer n_camarotes_yates, Integer pot_cv_motor, String matricula, Integer eslora, Integer anio_fabricacion, boolean alquilado) {
        super(pot_cv_motor, matricula, eslora, anio_fabricacion, alquilado);
        this.n_camarotes_yates = n_camarotes_yates;
    }

    public Integer getN_camarotes_yates() {
        return n_camarotes_yates;
    }

    public void setN_camarotes_yates(Integer n_camarotes_yates) {
        this.n_camarotes_yates = n_camarotes_yates;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return " BarcoLujo { " + super.toString() + " n_camarotes_yates= " + n_camarotes_yates + '}';
    }

}
