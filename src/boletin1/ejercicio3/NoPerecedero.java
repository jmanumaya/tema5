package boletin1.ejercicio3;

/**
 * La clase {@code NoPerecedero} representa un producto no perecedero, que extiende la clase {@code Producto}.
 * Incluye información sobre el tipo de producto no perecedero.
 */
public class NoPerecedero extends Producto {

    private String tipo;

    /**
     * Constructor de la clase NoPerecedero.
     *
     * @param nombre El nombre del producto no perecedero.
     * @param precio El precio del producto no perecedero.
     * @param tipo   El tipo de producto no perecedero.
     * @throws IllegalArgumentException Si el tipo está vacío.
     */
    public NoPerecedero(String nombre, Double precio, String tipo) {
        super(nombre, precio);
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío.");
        }
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo de producto no perecedero.
     *
     * @return El tipo de producto no perecedero.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de producto no perecedero.
     *
     * @param tipo El nuevo tipo de producto no perecedero.
     * @throws IllegalArgumentException Si el tipo está vacío.
     */
    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío.");
        }
        this.tipo = tipo;
    }

    /**
     * Devuelve una representación en cadena del producto no perecedero.
     *
     * @return Una cadena que representa el producto no perecedero.
     */
    @Override
    public String toString() {
        return super.toString() + "\t" + "Tipo: " + tipo;
    }

    /**
     * Calcula el precio total del producto no perecedero, utilizando la misma lógica que la clase Producto.
     *
     * @param cantidad La cantidad de productos.
     * @return El precio total del producto no perecedero.
     */
    @Override
    public double calcular(int cantidad) {
        return super.calcular(cantidad); // Misma lógica que Producto
    }
}