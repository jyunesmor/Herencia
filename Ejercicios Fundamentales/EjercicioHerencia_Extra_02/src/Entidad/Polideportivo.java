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
public class Polideportivo extends Edificio {

    private Boolean tipo_inst;
    private String nombre;

    public Polideportivo() {
    }

    public Polideportivo(Boolean tipo_inst, String nombre) {
        this.tipo_inst = tipo_inst;
        this.nombre = nombre;
    }

    public Polideportivo(Boolean tipo_inst, String nombre, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.tipo_inst = tipo_inst;
        this.nombre = nombre;
    }

    public Boolean getTipo_inst() {
        return tipo_inst;
    }

    public void setTipo_inst(Boolean tipo_inst) {
        this.tipo_inst = tipo_inst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String tipoInstalacion(){
        String  tipo ="No Techado";
        if (this.tipo_inst==true) {
           tipo = "Techado";
        } 
        return tipo;
    }
    
    
    @Override
    public String toString() {
        return "Polideportivo{" + "tipo_inst=" + tipoInstalacion() + ", nombre=" + nombre + '}';
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
  
}
