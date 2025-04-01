package analisis.ejercicio2;

/**
 * Clase que representa un DVD, un tipo de ficha de la biblioteca.
 * Hereda de la clase Ficha y añade propiedades específicas de DVDs.
 */
class DVD extends Ficha {

    /** Director del DVD. */
    String director;

    /** Año de publicación del DVD. */
    int anio;

    /** Tipo de DVD ("película", "documental" o "serie"). */
    String tipo;

    /**
     * Constructor para la clase DVD.
     *
     * @param numeroIdentificacion Número de identificación del DVD.
     * @param titulo               Título del DVD.
     * @param director             Director del DVD.
     * @param anio                 Año de publicación del DVD.
     * @param tipo                 Tipo de DVD ("película", "documental" o "serie").
     */
    public DVD(int numeroIdentificacion, String titulo, String director, int anio, String tipo) {
        super(numeroIdentificacion, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    /**
     * Obtiene el director del DVD.
     *
     * @return El director del DVD.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Establece el director del DVD.
     *
     * @param director El nuevo director del DVD.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Obtiene el año de publicación del DVD.
     *
     * @return El año de publicación del DVD.
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Establece el año de publicación del DVD.
     *
     * @param anio El nuevo año de publicación del DVD.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Obtiene el tipo de DVD.
     *
     * @return El tipo de DVD.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de DVD.
     *
     * @param tipo El nuevo tipo de DVD.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el tiempo de préstamo en días para el DVD.
     *
     * @return El tiempo de préstamo en días (5 días para DVDs).
     */
    @Override
    public int getTiempoPrestamo() {
        return 5;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Director: " + director + "\n" +
                "Año: " + anio + "\n" +
                "Tipo: " + tipo;
    }
}