package boletin1.ejercicio4;

/**
 * Clase que representa una lavadora, que hereda de Electrodomestico.
 */
public class Lavadora extends Electrodomestico {

    private int carga = 5;

    /**
     * Constructor para crear una lavadora con todos los atributos especificados.
     *
     * @param precioBase        Precio base de la lavadora.
     * @param color             Color de la lavadora.
     * @param consumoEnergetico Consumo energético de la lavadora.
     * @param peso              Peso de la lavadora.
     * @param carga             Carga de la lavadora.
     */
    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * Constructor para crear una lavadora con precio base y peso especificados.
     *
     * @param precioBase Precio base de la lavadora.
     * @param peso       Peso de la lavadora.
     */
    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
    }

    /**
     * Obtiene la carga de la lavadora.
     *
     * @return La carga de la lavadora.
     */
    public int getCarga() {
        return carga;
    }

    /**
     * Establece la carga de la lavadora.
     *
     * @param carga La nueva carga de la lavadora.
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }

    /**
     * Calcula el precio final de la lavadora, incluyendo el precio base y el aumento por carga.
     *
     * @return El precio final de la lavadora.
     */
    @Override
    public double precioFinal() {

        if (carga >= 30) {
            super.setPrecioBase(super.getPrecioBase() + 50);
        }

        return super.precioFinal();
    }
}