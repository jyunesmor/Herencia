
package Entidad;


public class BarcoEspeciales extends Barco {
    
    private Integer n_mastiles;
    private Integer pot_cv_motor;
    private Integer pot_cv_yates;
    private Integer n_camarotes_yates;

    public BarcoEspeciales() {
    }

    public BarcoEspeciales(Integer n_mastiles, Integer pot_cv_motor, Integer pot_cv_yates, Integer n_camarotes_yates, String matricula, Integer eslora, Integer anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.n_mastiles = n_mastiles;
        this.pot_cv_motor = pot_cv_motor;
        this.pot_cv_yates = pot_cv_yates;
        this.n_camarotes_yates = n_camarotes_yates;
    }

    public Integer getN_mastiles() {
        return n_mastiles;
    }

    public void setN_mastiles(Integer n_mastiles) {
        this.n_mastiles = n_mastiles;
    }

    public Integer getPot_cv_motor() {
        return pot_cv_motor;
    }

    public void setPot_cv_motor(Integer pot_cv_motor) {
        this.pot_cv_motor = pot_cv_motor;
    }

    public Integer getPot_cv_yates() {
        return pot_cv_yates;
    }

    public void setPot_cv_yates(Integer pot_cv_yates) {
        this.pot_cv_yates = pot_cv_yates;
    }

    public Integer getN_camarotes_yates() {
        return n_camarotes_yates;
    }

    public void setN_camarotes_yates(Integer n_camarotes_yates) {
        this.n_camarotes_yates = n_camarotes_yates;
    }
    
    
    
    
}
