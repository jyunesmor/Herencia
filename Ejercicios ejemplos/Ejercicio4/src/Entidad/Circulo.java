/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Utilidades.CalculoForma;

/**
 *
 * @author Juan
 */
public class Circulo implements CalculoForma{
 
    private Double radio; 
    private Double diametro; 

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

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public Double calculoArea() {
//        Double area = p * this.radio * this.radio;
        Double area = p * Math.pow(this.radio,2);
        return area;
    }

    @Override
    public Double calculoPerimetro() {
        Double perimetro = p * this.diametro;
        return perimetro;
    }
    
    
    
    
}
