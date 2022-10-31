
package Entidad;

import java.util.Date;


public class Clientes {
    
    private String nombre;
    private String documento;
    
    public Clientes() {
    }

    public Clientes(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

   
        
}
