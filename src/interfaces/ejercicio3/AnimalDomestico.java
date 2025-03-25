package interfaces.ejercicio3;

/**
 * Clase abstracta que representa un animal doméstico.
 * Implementa la interfaz Animal y añade atributos y métodos específicos para animales domésticos.
 */
public abstract class AnimalDomestico implements Animal {

    /**
     * El nombre del animal doméstico.
     */
    protected String nombre;

    /**
     * La raza del animal doméstico.
     */
    protected String raza;

    /**
     * El peso del animal doméstico.
     */
    protected double peso;

    /**
     * El color del animal doméstico.
     */
    protected String color;

    /**
     * Constructor para crear un nuevo AnimalDomestico.
     *
     * @param nombre El nombre del animal.
     * @param raza   La raza del animal.
     * @param peso   El peso del animal.
     * @param color  El color del animal.
     */
    public AnimalDomestico(String nombre, String raza, double peso, String color) {
        super();
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }

    /**
     * Vacuna al animal doméstico y muestra un mensaje.
     */
    public void vacunar() {
        System.out.println(nombre + " ha sido vacunado.");
    }

    /**
     * Método abstracto que determina si el animal doméstico hace caso.
     * Debe ser implementado por las subclases.
     *
     * @return true si el animal hace caso, false en caso contrario.
     */
    public abstract boolean hacerCaso();

    /**
     * Implementación del método comer de la interfaz Animal.
     * Muestra un mensaje indicando que el animal está comiendo.
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo...");
    }

    /**
     * Implementación del método dormir de la interfaz Animal.
     * Muestra un mensaje indicando que el animal está durmiendo.
     */
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }
}