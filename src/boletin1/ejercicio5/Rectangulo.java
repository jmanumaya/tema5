package boletin1.ejercicio5;

/**
 * Clase que representa un rectángulo, una subclase de Poligono.
 * Almacena y gestiona las dimensiones del rectángulo y calcula su área.
 */
public class Rectangulo extends Poligono{
    
    /**
     * Longitud del primer lado del rectángulo, inicializado a 1 por defecto.
     */
    private double lado1 = 1;
    
    /**
     * Longitud del segundo lado del rectángulo, inicializado a 1 por defecto.
     */
    private double lado2 = 1;
    
    /**
     * Constructor por defecto de la clase Rectangulo.
     * Inicializa un rectángulo con lados de longitud 1 y llama al constructor de la superclase Poligono con 2 lados.
     */
    public Rectangulo() {
        super(2);
    }

    /**
     * Constructor parametrizado de la clase Rectangulo.
     * Inicializa un rectángulo con las longitudes de lado especificadas y llama al constructor de la superclase Poligono con 2 lados.
     *
     * @param lado1 La longitud del primer lado del rectángulo.
     * @param lado2 La longitud del segundo lado del rectángulo.
     */
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Obtiene la longitud del primer lado del rectángulo.
     *
     * @return La longitud del primer lado.
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Establece la longitud del primer lado del rectángulo.
     *
     * @param lado1 La nueva longitud del primer lado.
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Obtiene la longitud del segundo lado del rectángulo.
     *
     * @return La longitud del segundo lado.
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Establece la longitud del segundo lado del rectángulo.
     *
     * @param lado2 La nueva longitud del segundo lado.
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Calcula y devuelve el área del rectángulo.
     *
     * @return El área del rectángulo (lado1 * lado2).
     */
    @Override
    public double area() {
    	return lado1 * lado2;
    }
    
    /**
     * Devuelve una representación en cadena del rectángulo.
     * Incluye el tipo de polígono, las longitudes de los lados y el área.
     *
     * @return Una cadena que representa el rectángulo.
     */
    @Override
    public String toString() {
        return "Tipo: Rectangulo, Lado 1: " + lado1 + ", Lado 2: " + lado2 + ", Area: " + this.area();
    }

    
}