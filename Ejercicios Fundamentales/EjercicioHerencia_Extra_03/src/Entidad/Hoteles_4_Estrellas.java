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
public class Hoteles_4_Estrellas extends Hoteles {
    
    
    private Character gimnasio;
    private Integer n_restaurante;
    private Integer cap_restaurante;

    public Hoteles_4_Estrellas(Character gimnasio, Integer n_restaurante, Integer cap_restaurante, Integer cant_hab, Integer n_cama, Integer cant_pisos, Double precio_hab, String nombre, String direccion, String localidad, String gerente) {
        super(cant_hab, n_cama, cant_pisos, precio_hab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.n_restaurante = n_restaurante;
        this.cap_restaurante = cap_restaurante;
    }

    public Character getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Character gimnasio) {
        this.gimnasio = gimnasio;
    }

    public Integer getN_restaurante() {
        return n_restaurante;
    }

    public void setN_restaurante(Integer n_restaurante) {
        this.n_restaurante = n_restaurante;
    }

    public Integer getCap_restaurante() {
        return cap_restaurante;
    }

    public void setCap_restaurante(Integer cap_restaurante) {
        this.cap_restaurante = cap_restaurante;
    }
    
    
    
}
