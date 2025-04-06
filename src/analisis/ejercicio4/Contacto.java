package analisis.ejercicio4;

import java.util.Objects;

/**
 * Representa un contacto con un nombre y un número de teléfono.
 *
 * @author jmaya
 * @version 1.0
 */
public class Contacto {

    private String nombre;

    private int telefono;

    /**
     * Constructor para crear un nuevo contacto con nombre y teléfono.
     *
     * @param nombre   El nombre del contacto.
     * @param telefono El número de teléfono del contacto.
     */
    public Contacto(String nombre, int telefono) {
        super();
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return El nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del contacto.
     *
     * @param nombre El nuevo nombre del contacto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de teléfono del contacto.
     *
     * @return El número de teléfono del contacto.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del contacto.
     *
     * @param telefono El nuevo número de teléfono del contacto.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Genera un código hash para el contacto basado en su nombre.
     *
     * @return El código hash del contacto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    /**
     * Compara este contacto con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar con este contacto.
     * @return {@code true} si los objetos son iguales, {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        Contacto other = (Contacto) obj;
        return nombre.equals(other.getNombre());
    }


    /**
     * Devuelve una representación en cadena del objeto Contacto.
     *
     * @return Una cadena que representa el nombre y el teléfono del contacto.
     */
    @Override
    public String toString() {
        return "Contacto -> Nombre: " + nombre + "\nTeléfono: " + telefono;
    }

}