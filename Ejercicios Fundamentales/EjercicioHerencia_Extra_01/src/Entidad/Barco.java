
package Entidad;

public class Barco {
    
    private String matricula;
    private Integer eslora;
    private Integer anio_fabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anio_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(Integer anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }
    
    
    
}
