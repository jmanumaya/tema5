package interfaces.ejercicio3;

/**
 * Interfaz que define el comportamiento básico de un animal.
 * Todos los animales deben ser capaces de comer, dormir y hacer ruido.
 */
public interface Animal {

    /**
     * Permite al animal comer.
     */
    void comer();

    /**
     * Permite al animal dormir.
     */
    void dormir();

    /**
     * Permite al animal hacer un sonido característico.
     */
    void hacerRuido();
}