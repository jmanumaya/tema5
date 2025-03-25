package boletin1.ejercicio5;

/**
 * Clase que representa un triángulo, una subclase de Poligono.
 * Almacena y gestiona las longitudes de los lados del triángulo y calcula su área.
 */
public class Triangulo extends Poligono{
    
    /**
     * Longitud del primer lado del triángulo, inicializado a 1 por defecto.
     */
    private double lado1 = 1;
    
    /**
     * Longitud del segundo lado del triángulo, inicializado a 1 por defecto.
     */
    private double lado2 = 1;
    
    /**
     * Longitud del tercer lado del triángulo, inicializado a 1 por defecto.
     */
    private double lado3 = 1;
    
    /**
     * Constructor por defecto de la clase Triangulo.
     * Inicializa un triángulo con lados de longitud 1 y llama al constructor de la superclase Poligono con 3 lados.
     */
    public Triangulo() {
        super(3);
    }

    /**
     * Constructor parametrizado de la clase Triangulo.
     * Inicializa un triángulo con las longitudes de lado especificadas y llama al constructor de la superclase Poligono con 3 lados.
     *
     * @param lado1 La longitud del primer lado del triángulo.
     * @param lado2 La longitud del segundo lado del triángulo.
     * @param lado3 La longitud del tercer lado del triángulo.
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Obtiene la longitud del primer lado del triángulo.
     *
     * @return La longitud del primer lado.
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Establece la longitud del primer lado del triángulo.
     *
     * @param lado1 La nueva longitud del primer lado.
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Obtiene la longitud del segundo lado del triángulo.
     *
     * @return La longitud del segundo lado.
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Establece la longitud del segundo lado del triángulo.
     *
     * @param lado2 La nueva longitud del segundo lado.
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    /**
     * Obtiene la longitud del tercer lado del triángulo.
     *
     * @return La longitud del tercer lado.
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Establece la longitud del tercer lado del triángulo.
     *
     * @param lado3 La nueva longitud del tercer lado.
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    /**
     * Calcula y devuelve el área del triángulo utilizando la fórmula de Herón.
     * Lanza una excepción IllegalArgumentException si los lados no forman un triángulo válido.
     *
     * @return El área del triángulo.
     * @throws IllegalArgumentException Si los lados no forman un triángulo válido.
     */
    @Override
    public double area() {
        
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido");
        }
        
        double s = (lado1 + lado2 + lado3) / 2; // Semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    /**
     * Devuelve una representación en cadena del triángulo.
     * Incluye el tipo de polígono, las longitudes de los lados y el área.
     *
     * @return Una cadena que representa el triángulo.
     */
    @Override
    public String toString() {
        return "Tipo: Triangulo, Lado 1: " + lado1 + ", Lado 2: " + lado2 + ", Lado 3: " + lado3 + ", Area: " + this.area();
    }

}