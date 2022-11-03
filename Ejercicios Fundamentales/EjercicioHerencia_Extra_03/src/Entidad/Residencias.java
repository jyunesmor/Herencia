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
public class Residencias extends ExtraHoteles {
    
    private Integer c_hab;
    private boolean desc_gremio;
    private boolean camp_dep;

    public Residencias(Integer c_hab, boolean desc_gremio, boolean camp_dep, boolean privado, Double m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.c_hab = c_hab;
        this.desc_gremio = desc_gremio;
        this.camp_dep = camp_dep;
    }

    public Integer getC_hab() {
        return c_hab;
    }

    public void setC_hab(Integer c_hab) {
        this.c_hab = c_hab;
    }

    public boolean isDesc_gremio() {
        return desc_gremio;
    }

    public void setDesc_gremio(boolean desc_gremio) {
        this.desc_gremio = desc_gremio;
    }

    public boolean isCamp_dep() {
        return camp_dep;
    }

    public void setCamp_dep(boolean camp_dep) {
        this.camp_dep = camp_dep;
    }

    @Override
    public String toString() {
        return "Residencias{" + "c_hab=" + c_hab + ", desc_gremio=" + desc_gremio + ", camp_dep=" + camp_dep + '}';
    }
 
    
    
    
    
}
