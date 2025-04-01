package analisis.ejercicio2;

/**
 * Clase abstracta que representa una ficha genérica para objetos de una biblioteca.
 * Contiene propiedades y métodos comunes a todos los tipos de fichas.
 */
abstract class Ficha {

    /** Número de identificación único de la ficha. */
    int numeroIdentificacion;

    /** Título del objeto representado por la ficha. */
    String titulo;

    /**
     * Constructor para la clase Ficha.
     *
     * @param numeroIdentificacion Número de identificación de la ficha.
     * @param titulo               Título del objeto representado por la ficha.
     */
    public Ficha(int numeroIdentificacion, String titulo) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.titulo = titulo;
    }

    /**
     * Obtiene el número de identificación de la ficha.
     *
     * @return El número de identificación de la ficha.
     */
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Establece el número de identificación de la ficha.
     *
     * @param numeroIdentificacion El nuevo número de identificación de la ficha.
     */
    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
     * Obtiene el título del objeto representado por la ficha.
     *
     * @return El título del objeto.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del objeto representado por la ficha.
     *
     * @param titulo El nuevo título del objeto.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método abstracto que devuelve el tiempo de préstamo en días para el objeto representado por la ficha.
     *
     * @return El tiempo de préstamo en días.
     */
    public abstract int getTiempoPrestamo();

    @Override
    public String toString() {
        return "Número de identificación: " + numeroIdentificacion + "\n" +
                "Título: " + titulo;
    }
}