
package Entidad;

public class Barco {
    
    protected String matricula;
    protected Integer eslora;
    protected Integer anio_fabricacion;
    protected boolean alquilado;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anio_fabricacion, boolean alquilado) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio_fabricacion = anio_fabricacion;
        this.alquilado = alquilado;
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

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio_fabricacion=" + anio_fabricacion + ", alquilado=" + alquilado + '}';
    }
    
    
}
