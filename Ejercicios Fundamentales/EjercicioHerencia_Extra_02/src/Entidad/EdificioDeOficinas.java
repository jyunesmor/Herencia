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
public class EdificioDeOficinas extends Edificio {
    
    private Integer n_pisos;
    private Integer n_pers_of;
    private Integer n_ofi;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer n_pisos, Integer n_pers_of, Integer n_ofi, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.n_pisos = n_pisos;
        this.n_pers_of = n_pers_of;
        this.n_ofi = n_ofi;
    }

    public Integer getN_pisos() {
        return n_pisos;
    }

    public void setN_pisos(Integer n_pisos) {
        this.n_pisos = n_pisos;
    }

    public Integer getN_pers_of() {
        return n_pers_of;
    }

    public void setN_pers_of(Integer n_pers_of) {
        this.n_pers_of = n_pers_of;
    }

    public Integer getN_ofi() {
        return n_ofi;
    }

    public void setN_ofi(Integer n_ofi) {
        this.n_ofi = n_ofi;
    }
  
    
    @Override
    public Double calcularSuperficie() {
          Double superficie = super.ancho * super.largo;
        
        return superficie;
    }

    @Override
    public Double calcularVolumen() {
       
        Double volumen = super.ancho * super.largo * super.alto;
      
        return volumen;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "n_pisos=" + n_pisos + ", n_pers_of=" + n_pers_of + ", n_ofi=" + n_ofi + '}';
    }
    
    
    
}
