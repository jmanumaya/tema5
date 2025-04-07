package analisis.ejercicio3;

import java.util.Comparator;

/**
 * Compara titulares por apellidos y luego por nombre.
 */
public class ComparaApellidosYNombre implements Comparator<Titular> {

    /**
     * Compara dos titulares primero por apellidos y, si son iguales, por nombre.
     *
     * @param titular1 Primer titular.
     * @param titular2 Segundo titular.
     * @return Negativo si titular1 va antes, positivo si va después, cero si son iguales.
     */
    @Override
    public int compare(Titular titular1, Titular titular2) {
        int resultado = titular1.getApellidos().compareTo(titular2.getApellidos());
        if (resultado == 0) {
            resultado = titular1.getNombre().compareTo(titular2.getNombre());
        }
        return resultado;
    }

}