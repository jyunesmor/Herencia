/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Juan
 */
public class BarcoMotor extends Barco{
    
    protected Integer pot_cv_motor;

    public BarcoMotor() {
    }

      
    public BarcoMotor(Integer pot_cv_motor, String matricula, Integer eslora, Integer anio_fabricacion, boolean alquilado) {
        super(matricula, eslora, anio_fabricacion, alquilado);
        this.pot_cv_motor = pot_cv_motor;
    }

    public Integer getPot_cv_motor() {
        return pot_cv_motor;
    }

    public void setPot_cv_motor(Integer pot_cv_motor) {
        this.pot_cv_motor = pot_cv_motor;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return " BarcoMotor {"  + super.toString() + " pot_cv_motor= " + pot_cv_motor + '}';
    }
  
    
    
}
