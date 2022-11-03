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
public class ExtraHoteles extends Alojamiento {

    private boolean privado;
    private Double m2;

    public ExtraHoteles(boolean privado, Double m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.m2 = m2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getM2() {
        return m2;
    }

    
    public void setM2(Double m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "ExtraHoteles{" + "privado=" + privado + ", m2=" + m2 + '}';
    }
    
    
    

    
  
    
}
