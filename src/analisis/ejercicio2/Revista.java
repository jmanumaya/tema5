package analisis.ejercicio2;

/**
 * Clase que representa una revista, un tipo de ficha de la biblioteca.
 * Hereda de la clase Ficha y añade propiedades específicas de revistas.
 */
class Revista extends Ficha {

    /** Número de la revista. */
    int numeroRevista;

    /** Año de publicación de la revista. */
    int anioPublicacion;

    /**
     * Constructor para la clase Revista.
     *
     * @param numeroIdentificacion Número de identificación de la revista.
     * @param titulo               Título de la revista.
     * @param numeroRevista        Número de la revista.
     * @param anioPublicacion      Año de publicación de la revista.
     */
    public Revista(int numeroIdentificacion, String titulo, int numeroRevista, int anioPublicacion) {
        super(numeroIdentificacion, titulo);
        this.numeroRevista = numeroRevista;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el número de la revista.
     *
     * @return El número de la revista.
     */
    public int getNumeroRevista() {
        return numeroRevista;
    }

    /**
     * Establece el número de la revista.
     *
     * @param numeroRevista El nuevo número de la revista.
     */
    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    /**
     * Obtiene el año de publicación de la revista.
     *
     * @return El año de publicación de la revista.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Establece el año de publicación de la revista.
     *
     * @param anioPublicacion El nuevo año de publicación de la revista.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el tiempo de préstamo en días para la revista.
     *
     * @return El tiempo de préstamo en días (10 días para revistas).
     */
    @Override
    public int getTiempoPrestamo() {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Número de revista: " + numeroRevista + "\n" +
                "Año de publicación: " + anioPublicacion;
    }
}