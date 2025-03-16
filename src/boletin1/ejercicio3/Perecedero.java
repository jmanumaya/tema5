package boletin1.ejercicio3;

/**
 * La clase {@code Perecedero} representa un producto perecedero, que extiende la clase {@code Producto}.
 * Incluye información sobre los días restantes hasta la caducidad y aplica descuentos según esos días.
 */
public class Perecedero extends Producto {

    private int diasACaducar;

    /**
     * Constructor de la clase Perecedero.
     *
     * @param nombre        El nombre del producto.
     * @param precio        El precio del producto.
     * @param diasACaducar  Los días restantes hasta la caducidad del producto.
     * @throws IllegalArgumentException Si los días a caducar son negativos.
     */
    public Perecedero(String nombre, Double precio, int diasACaducar) {
        super(nombre, precio);
        if (diasACaducar < 0) {
            throw new IllegalArgumentException("Los días a caducar no pueden ser negativos.");
        }
        this.diasACaducar = diasACaducar;
    }

    /**
     * Obtiene los días restantes hasta la caducidad del producto.
     *
     * @return Los días restantes hasta la caducidad.
     */
    public int getDiasACaducar() {
        return diasACaducar;
    }

    /**
     * Establece los días restantes hasta la caducidad del producto.
     *
     * @param diasACaducar Los nuevos días restantes hasta la caducidad.
     * @throws IllegalArgumentException Si los días a caducar son negativos.
     */
    public void setDiasACaducar(int diasACaducar) {
        if (diasACaducar < 0) {
            throw new IllegalArgumentException("Los días a caducar no pueden ser negativos.");
        }
        this.diasACaducar = diasACaducar;
    }

    /**
     * Devuelve una representación en cadena del producto perecedero.
     *
     * @return Una cadena que representa el producto perecedero.
     */
    @Override
    public String toString() {
        return super.toString() + "\t" + "Dias a Caducar: " + diasACaducar;
    }

    /**
     * Calcula el precio total del producto perecedero, aplicando descuentos según los días restantes hasta la caducidad.
     *
     * @param cantidad La cantidad de productos.
     * @return El precio total del producto perecedero.
     */
    @Override
    public double calcular(int cantidad) {
        double precioBase = super.calcular(cantidad);

        switch (diasACaducar) {
            case 1:
                precioBase = precioBase / 4;
            case 2:
                precioBase = precioBase / 3;
            case 3:
                precioBase = precioBase / 2;
        }

        return precioBase;
    }
}