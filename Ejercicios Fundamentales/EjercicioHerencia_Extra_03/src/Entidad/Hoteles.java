
package Entidad;

public class Hoteles extends Alojamiento {
    
        private Integer cant_hab;
        private Integer n_cama;
        private Integer cant_pisos;
        private Double precio_hab;

    public Hoteles(Integer cant_hab, Integer n_cama, Integer cant_pisos, Double precio_hab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cant_hab = cant_hab;
        this.n_cama = n_cama;
        this.cant_pisos = cant_pisos;
        this.precio_hab = precio_hab;
    }

    public Integer getCant_hab() {
        return cant_hab;
    }

    public void setCant_hab(Integer cant_hab) {
        this.cant_hab = cant_hab;
    }

    public Integer getN_cama() {
        return n_cama;
    }

    public void setN_cama(Integer n_cama) {
        this.n_cama = n_cama;
    }

    public Integer getCant_pisos() {
        return cant_pisos;
    }

    public void setCant_pisos(Integer cant_pisos) {
        this.cant_pisos = cant_pisos;
    }

    public Double getPrecio_hab() {
        return precio_hab;
    }

    public void setPrecio_hab(Double precio_hab) {
        this.precio_hab = precio_hab;
    }

    @Override
    public String toString() {
        return "Hoteles{" + "cant_hab=" + cant_hab + ", n_cama=" + n_cama + ", cant_pisos=" + cant_pisos + ", precio_hab=" + precio_hab + '}';
    }

      
    
        
}
