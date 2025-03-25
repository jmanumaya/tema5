package interfaces.ejercicio3;

import java.util.Random;

/**
 * Clase que representa un perro, un tipo de animal doméstico.
 * Hereda de AnimalDomestico e implementa comportamientos específicos de perro.
 */
public class Perro extends AnimalDomestico {

    /**
     * Constructor para crear un nuevo Perro.
     *
     * @param nombre El nombre del perro.
     * @param raza   La raza del perro.
     * @param peso   El peso del perro.
     * @param color  El color del perro.
     */
    public Perro(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    /**
     * Implementación del método hacerRuido de la interfaz Animal.
     * El perro ladra.
     */
    @Override
    public void hacerRuido() {
        System.out.println(super.nombre + " hace: ¡Guau!");
    }

    /**
     * Implementación del método hacerCaso de AnimalDomestico.
     * El perro hace caso con una probabilidad del 90%.
     *
     * @return true si el perro hace caso, false en caso contrario.
     */
    @Override
    public boolean hacerCaso() {
        Random random = new Random();
        return random.nextInt(0, 101) < 90;
    }

    /**
     * Método específico del perro para simular un paseo.
     */
    public void sacarPaseo() {
        System.out.println(nombre + " ha salido de paseo.");
    }
}