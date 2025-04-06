package analisis.ejercicio4;

/**
 * Representa un contacto de empresa, extendiendo la clase Contacto con información adicional sobre su página web.
 *
 * @author jmaya
 * @version 1.0
 */
public class ContactoEmpresa extends Contacto {


    private String paginaWeb;


    /**
     * Constructor para crear un nuevo contacto de empresa con nombre, teléfono y página web.
     *
     * @param nombre     El nombre del contacto de empresa.
     * @param telefono   El número de teléfono del contacto de empresa.
     * @param paginaWeb  La página web del contacto de empresa.
     */
    public ContactoEmpresa(String nombre, int telefono, String paginaWeb) {
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }

    /**
     * Obtiene la página web del contacto de empresa.
     *
     * @return La página web del contacto de empresa.
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Establece la página web del contacto de empresa.
     *
     * @param paginaWeb La nueva página web del contacto de empresa.
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    /**
     * Devuelve una representación en cadena del objeto ContactoEmpresa, incluyendo la información de la superclase y la página web.
     *
     * @return Una cadena que representa el nombre, teléfono y página web del contacto de empresa.
     */
    @Override
    public String toString() {
        return super.toString() + "\nPágina web: " + paginaWeb;
    }

}