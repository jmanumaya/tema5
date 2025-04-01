package analisis.ejercicio2;

/**
 * Clase que representa un libro, un tipo de ficha de la biblioteca.
 * Hereda de la clase Ficha y añade propiedades específicas de libros.
 */
class Libro extends Ficha {

    /** Autor del libro. */
    String autor;

    /** Editorial del libro. */
    String editorial;

    /**
     * Constructor para la clase Libro.
     *
     * @param numeroIdentificacion Número de identificación del libro.
     * @param titulo               Título del libro.
     * @param autor                Autor del libro.
     * @param editorial            Editorial del libro.
     */
    public Libro(int numeroIdentificacion, String titulo, String autor, String editorial) {
        super(numeroIdentificacion, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene la editorial del libro.
     *
     * @return La editorial del libro.
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Establece la editorial del libro.
     *
     * @param editorial La nueva editorial del libro.
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Obtiene el tiempo de préstamo en días para el libro.
     *
     * @return El tiempo de préstamo en días (15 días para libros).
     */
    @Override
    public int getTiempoPrestamo() {
        return 15;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Autor: " + autor + "\n" +
                "Editorial: " + editorial;
    }
}
