package Entidades;

public class Televisor extends Electrodomesticos {

    private Integer pulgadas;

    private boolean sintonizadorTDT;

    String sint ="";
    
    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean sintonizadorTDT, Integer precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }
 
    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean getSintonizadorTDT() {
        if (sintonizadorTDT=true) {
            sint = " Tiene Sintonizador Digital";
        }else{
            sint = " No tiene Sintonizador Digital";
        }
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    

    @Override
    public String toString() {
       return " El Electrodomestico TELEVISOR [ Tiene un Valor de: $ " + super.getPrecio() +
               ", es de color :" + super.getColor() + ", su consumo es del Tipo " + super.getConsumo() + ", con un peso de: " + super.getPeso() + 
               " kg, tiene " + pulgadas + " Pulgadas. ]";
    }
    
    
 }
