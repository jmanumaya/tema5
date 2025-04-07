package analisis.ejercicio2;

import java.util.Comparator;

/**
 * Implementa la interfaz {@code Comparator} para comparar objetos {@code Ficha}
 * basándose en su título.
 */
public class ComparaTitulos implements Comparator<Ficha> {

    /**
     * Compara dos objetos {@code Ficha} según el orden alfabético de sus títulos.
     *
     * @param ficha1 La primera ficha a comparar.
     * @param ficha2 La segunda ficha a comparar.
     * @return Un valor negativo si el título de {@code ficha1} va antes
     * alfabéticamente que el título de {@code ficha2}; cero si los
     * títulos son iguales; y un valor positivo si el título de
     * {@code ficha1} va después alfabéticamente que el título de
     * {@code ficha2}.
     */
    @Override
    public int compare(Ficha ficha1, Ficha ficha2) {
        return ficha1.getTitulo().compareTo(ficha2.getTitulo());
    }

}