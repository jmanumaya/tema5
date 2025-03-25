package interfaces.ejercicio3;

import java.util.Random;

/**
 * Clase que representa un gato, un tipo de animal doméstico.
 * Hereda de AnimalDomestico e implementa comportamientos específicos de gato.
 */
public class Gato extends AnimalDomestico {

    /**
     * Constructor para crear un nuevo Gato.
     *
     * @param nombre El nombre del gato.
     * @param raza   La raza del gato.
     * @param peso   El peso del gato.
     * @param color  El color del gato.
     */
    public Gato(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    /**
     * Implementación del método hacerRuido de la interfaz Animal.
     * El gato maulla.
     */
    @Override
    public void hacerRuido() {
        System.out.println(super.nombre + " hace: ¡Miau!");
    }

    /**
     * Implementación del método hacerCaso de AnimalDomestico.
     * El gato hace caso con una probabilidad del 5%.
     *
     * @return true si el gato hace caso, false en caso contrario.
     */
    @Override
    public boolean hacerCaso() {
        Random random = new Random();
        return random.nextInt(0, 101) < 5;
    }

    /**
     * Método específico del gato para simular la tos de una bola de pelo.
     */
    public void toserBolaPelo() {
        System.out.println(nombre + " ha tosido una bola de pelo.");
    }
}