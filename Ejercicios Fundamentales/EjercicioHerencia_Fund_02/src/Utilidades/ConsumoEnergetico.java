
package Utilidades;

public enum ConsumoEnergetico {
    
    A (1000),
    B (800),
    C (600),
    D (500),
    E (300),
    F (100);

    private int precio_por_consumo;

    private ConsumoEnergetico() {
    }

    private ConsumoEnergetico(int precio_por_consumo) {
        this.precio_por_consumo = precio_por_consumo;
    }

    public int getPrecio_por_consumo() {
        return precio_por_consumo;
    }

    public void setPrecio_por_consumo(int precio_por_consumo) {
        this.precio_por_consumo = precio_por_consumo;
    }

    @Override
    public String toString() {
        return "El Precio del consumo Tipo " + this.name() + " es de: $ " + precio_por_consumo;
    }

    
}
