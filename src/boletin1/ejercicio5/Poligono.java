package boletin1.ejercicio5;

/**
 * Clase abstracta que representa un polígono genérico.
 * Proporciona una base para la creación de diferentes tipos de polígonos,
 * como triángulos, cuadrados, pentágonos, etc.
 */
public abstract class Poligono {

    /**
     * Número de lados del polígono.
     */
    protected int numeroLados;

    /**
     * Constructor de la clase Poligono.
     * Inicializa el número de lados del polígono.
     *
     * @param numeroLados El número de lados del polígono. Debe ser mayor que 0.
     */
    public Poligono(int numeroLados) {
        if (numeroLados > 0) {
            this.numeroLados = numeroLados;
        }
    }

    /**
     * Obtiene el número de lados del polígono.
     *
     * @return El número de lados del polígono.
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * Método abstracto para calcular el área del polígono.
     * Cada subclase debe implementar este método para proporcionar
     * el cálculo específico del área para su tipo de polígono.
     *
     * @return El área del polígono.
     */
    public abstract double area();

    /**
     * Devuelve una representación en cadena del polígono.
     * Incluye el número de lados del polígono.
     *
     * @return Una cadena que representa el polígono.
     */
    @Override
    public String toString() {
        return "Número de Lados: " + numeroLados;
    }
}