package analisis.ejercicio4;

/**
 * Representa un contacto de persona, extendiendo la clase Contacto con información adicional sobre su cumpleaños.
 *
 * @author jmaya
 * @version 1.0
 */
public class ContactoPersona extends Contacto {

    private String cumpleaños;

    /**
     * Constructor para crear un nuevo contacto de persona con nombre, teléfono y cumpleaños.
     *
     * @param nombre     El nombre del contacto de persona.
     * @param telefono   El número de teléfono del contacto de persona.
     * @param cumpleaños La fecha de cumpleaños del contacto de persona.
     */
    public ContactoPersona(String nombre, int telefono, String cumpleaños) {
        super(nombre, telefono);
        this.cumpleaños = cumpleaños;
    }

    /**
     * Obtiene la fecha de cumpleaños del contacto de persona.
     *
     * @return La fecha de cumpleaños del contacto de persona.
     */
    public String getCumpleaños() {
        return cumpleaños;
    }

    /**
     * Establece la fecha de cumpleaños del contacto de persona.
     *
     * @param cumpleaños La nueva fecha de cumpleaños del contacto de persona.
     */
    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    /**
     * Devuelve una representación en cadena del objeto ContactoPersona, incluyendo la información de la superclase y el cumpleaños.
     *
     * @return Una cadena que representa el nombre, teléfono y cumpleaños del contacto de persona.
     */
    @Override
    public String toString() {
        return super.toString() + "\nFecha: " + cumpleaños;
    }

}