package Entidades;

public class Televisor extends Electrodomesticos {

    private Integer pulgadas;

    private boolean sintonizadorTDT;

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

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    

        @Override
    public String toString() {
        return super.toString() + pulgadas.toString();
        
    }
    
    
 }
