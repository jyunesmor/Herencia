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
public class Hoteles_5_Estrellas extends Hoteles_4_Estrellas{
    
    
    private Integer c_salones;
    private Integer c_suites;
    private Integer c_limosinas;

    public Hoteles_5_Estrellas(Integer c_salones, Integer c_suites, Integer c_limosinas, Character gimnasio, Integer n_restaurante, Integer cap_restaurante, Integer cant_hab, Integer n_cama, Integer cant_pisos, Double precio_hab, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, n_restaurante, cap_restaurante, cant_hab, n_cama, cant_pisos, precio_hab, nombre, direccion, localidad, gerente);
        this.c_salones = c_salones;
        this.c_suites = c_suites;
        this.c_limosinas = c_limosinas;
    }

    public Integer getC_salones() {
        return c_salones;
    }

    public void setC_salones(Integer c_salones) {
        this.c_salones = c_salones;
    }

    public Integer getC_suites() {
        return c_suites;
    }

    public void setC_suites(Integer c_suites) {
        this.c_suites = c_suites;
    }

    public Integer getC_limosinas() {
        return c_limosinas;
    }

    public void setC_limosinas(Integer c_limosinas) {
        this.c_limosinas = c_limosinas;
    }

     
    
    @Override
    public String toString() {
        return "Hoteles_5_Estrellas{" + "c_salones=" + c_salones + ", c_suites=" + c_suites + ", c_limosinas=" + c_limosinas + '}';
    }
    
    
    
}
