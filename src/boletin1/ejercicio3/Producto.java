package boletin1.ejercicio3;

/**
 * La clase {@code Producto} representa un producto con nombre y precio.
 * Permite realizar operaciones básicas sobre los productos.
 */
public class Producto {

    private String nombre;
    private Double precio;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     * @throws IllegalArgumentException Si el nombre está vacío o el precio es negativo.
     */
    public Producto(String nombre, Double precio) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (precio == null || precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nuevo nombre del producto.
     * @throws IllegalArgumentException Si el nombre está vacío.
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El nuevo precio del producto.
     * @throws IllegalArgumentException Si el precio es negativo.
     */
    public void setPrecio(Double precio) {
        if (precio == null || precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    /**
     * Calcula el precio total para una cantidad dada de productos.
     *
     * @param cantidad La cantidad de productos.
     * @return El precio total.
     */
    public double calcular(int cantidad) {
        return precio * cantidad;
    }

    /**
     * Devuelve una representación en cadena del producto.
     *
     * @return Una cadena que representa el producto.
     */
    @Override
    public String toString() {
        return "Producto: " + nombre + "\t" + "Precio: " + precio + "€";
    }
}