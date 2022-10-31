
package Entidades;

import Utilidades.CalculoFormas;
import java.util.Scanner;

public class Circulo implements CalculoFormas {


    private Double radio;
    private Double diametro;
    private Double area;
    private Double perimetro;

    public Circulo() {
       
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
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
       this.area = PI * this.radio * this.radio;
       return this.area;
    }

    @Override
    public Double calculoPerimetro() {
       this.perimetro = PI * this.diametro; 
       return this.perimetro;
    }


    
    
}
