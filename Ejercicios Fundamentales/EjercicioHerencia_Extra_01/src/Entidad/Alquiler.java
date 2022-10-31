/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

public class Alquiler {
 
    private Date fecha_alquiler;
    private Date fecha_devolucion;
    private Integer pos_amarre;
    private Barco embarcacion;

    public Alquiler() {
    }

    public Alquiler(Date fecha_alquiler, Date fecha_devolucion, Integer pos_amarre, Barco embarcacion) {
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.pos_amarre = pos_amarre;
        this.embarcacion = embarcacion;
    }

    public Date getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(Date fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Integer getPos_amarre() {
        return pos_amarre;
    }

    public void setPos_amarre(Integer pos_amarre) {
        this.pos_amarre = pos_amarre;
    }

    public Barco getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Barco embarcacion) {
        this.embarcacion = embarcacion;
    }
    
    
    
    
}
