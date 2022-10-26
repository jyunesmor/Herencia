
package Entidad;


public class Animal {
 
    private String nombre;
    private Integer edad;
    private String alimento;
    private String raza;

    public Animal() {
    }

    public Animal(String nombre, Integer edad, String alimento, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", alimento=" + alimento + ", raza=" + raza + '}';
    }
  
  public void alimentarse(){
  
      
  }
  
  
    
    
}
