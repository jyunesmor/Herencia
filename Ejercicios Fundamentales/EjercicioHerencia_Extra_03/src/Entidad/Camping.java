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
public class Camping extends ExtraHoteles {
    
    private Integer c_max_carp;
    private Integer c_baño_disp;
    private Boolean restaurant;

    public Camping(Integer c_max_carp, Integer c_baño_disp, Boolean restaurant, boolean privado, Double m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.c_max_carp = c_max_carp;
        this.c_baño_disp = c_baño_disp;
        this.restaurant = restaurant;
    }

    public Integer getC_max_carp() {
        return c_max_carp;
    }

    public void setC_max_carp(Integer c_max_carp) {
        this.c_max_carp = c_max_carp;
    }

    public Integer getC_baño_disp() {
        return c_baño_disp;
    }

    public void setC_baño_disp(Integer c_baño_disp) {
        this.c_baño_disp = c_baño_disp;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }


    @Override
    public String toString() {
        return "Camping{" + "c_max_carp=" + c_max_carp + ", c_ba\u00f1o_disp=" + c_baño_disp + ", restaurant=" + restaurant + '}';
    }

    
    
    
}
