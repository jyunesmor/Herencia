package Entidades;

public class Animal {

    private String nombre;

    private String Alimento;

    private Integer edad;

    private String raza;

    public Animal(String nombre, String Alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.Alimento = Alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", Alimento=" + Alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }

    public void alimentarse() {
        
        System.out.println(" El alimento del " + nombre + " es : " + Alimento );
    }
}
