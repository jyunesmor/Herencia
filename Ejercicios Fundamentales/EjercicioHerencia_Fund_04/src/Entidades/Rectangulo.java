
package Entidades;

import Utilidades.CalculoFormas;

public class Rectangulo implements CalculoFormas {
    
    private Double base;
    private Double altura;
    private Double area;
    private Double perimetro;

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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public Double calculoArea() {
       area = base * altura;
       return area;
    }

    @Override
    public Double calculoPerimetro() {
       perimetro = (base + altura)* 2; 
       return perimetro;
    }

    
    
    
}
