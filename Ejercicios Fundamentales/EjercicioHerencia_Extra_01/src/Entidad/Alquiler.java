/*

 */
package Entidad;

import java.util.Date;

public class Alquiler  {
 
    
    private String nombre;
    private long documento;
    private Date fecha_alquiler;
    private Date fecha_devolucion;
    private Integer pos_amarre;
    private Barco embarcacion;


    public Alquiler() {
    }

    public Alquiler(String nombre, long documento, Date fecha_alquiler, Date fecha_devolucion, Integer pos_amarre, Barco embarcacion) {
        this.nombre = nombre;
        this.documento = documento;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }


    @Override
    public String toString() {
        return "Alquiler{" + "fecha_alquiler=" + fecha_alquiler + ", fecha_devolucion=" + fecha_devolucion + ", pos_amarre=" + pos_amarre + ", embarcacion=" + embarcacion + '}';
    }
    
    
    
    
}
