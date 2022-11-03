
package Entidad;

import Utilidades.CalculoForma;


public class Rectangulo implements CalculoForma {
    
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public Double calculoArea() {
        Double area = this.base * this.altura;
        return area;
    }

    @Override
    public Double calculoPerimetro() {
        Double perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }
    
    
    
}
