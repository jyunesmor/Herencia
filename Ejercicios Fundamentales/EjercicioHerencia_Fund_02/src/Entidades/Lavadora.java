package Entidades;


public class Lavadora extends Electrodomesticos {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
       return " El Electrodomestico LAVADORA [ Tiene un Valor de: $ " + super.getPrecio() +
               ", es de color :" + super.getColor() + ", su consumo es del Tipo " + super.getConsumo() + ", con un peso de: " + super.getPeso() + 
               " kg, y tiene una carga maxima de: " + carga + " kg ]";
    }

}
