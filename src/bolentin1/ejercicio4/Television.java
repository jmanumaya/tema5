package bolentin1.ejercicio4;

/**
 * Clase que representa una televisión, que hereda de Electrodomestico.
 */
public class Television extends Electrodomestico {

    private double resolucion = 20;

    private boolean sintonizadorTDT = false;

    /**
     * Constructor para crear una televisión con precio base y peso especificados.
     *
     * @param precioBase Precio base de la televisión.
     * @param peso       Peso de la televisión.
     */
    public Television(double precioBase, int peso) {
        super(precioBase, peso);
    }

    /**
     * Constructor para crear una televisión con todos los atributos especificados.
     *
     * @param precioBase        Precio base de la televisión.
     * @param color             Color de la televisión.
     * @param consumoEnergetico Consumo energético de la televisión.
     * @param peso              Peso de la televisión.
     * @param resolucion        Resolución de la televisión en pulgadas.
     * @param sintonizadorTDT   Indica si la televisión tiene sintonizador TDT.
     */
    public Television(double precioBase, String color, char consumoEnergetico, int peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Obtiene la resolución de la televisión.
     *
     * @return La resolución de la televisión en pulgadas.
     */
    public double getResolucion() {
        return resolucion;
    }

    /**
     * Establece la resolución de la televisión.
     *
     * @param resolucion La nueva resolución de la televisión en pulgadas.
     */
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * Indica si la televisión tiene sintonizador TDT.
     *
     * @return true si la televisión tiene sintonizador TDT, false en caso contrario.
     */
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    /**
     * Establece si la televisión tiene sintonizador TDT.
     *
     * @param sintonizadorTDT true si la televisión tiene sintonizador TDT, false en caso contrario.
     */
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Calcula el precio final de la televisión, incluyendo el precio base y los aumentos por resolución y sintonizador TDT.
     *
     * @return El precio final de la televisión.
     */
    @Override
    public double precioFinal() {

        if (resolucion >= 40) {
            super.setPrecioBase(super.getPrecioBase() * 1.30);
        }

        if (sintonizadorTDT) {
            super.setPrecioBase(super.getPrecioBase() + 50);
        }

        return super.precioFinal();
    }
}