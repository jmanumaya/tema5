package interfaces.ejercicio1;

/**
 * La clase Socio representa a un miembro de un club o asociación.
 * Implementa la interfaz Comparable para permitir la comparación de objetos Socio
 * basada en su identificador único (ID).
 */
public class Socio implements Comparable<Socio> {

    /**
     * Identificador único del socio.
     */
    private int id;

    /**
     * Nombre del socio.
     */
    private String nombre;

    /**
     * Edad del socio.
     */
    private int edad;

    /**
     * Constructor para crear un nuevo objeto Socio.
     *
     * @param id     El identificador único del socio.
     * @param nombre El nombre del socio.
     * @param edad   La edad del socio.
     */
    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
     * Devuelve una representación en cadena del objeto Socio.
     *
     * @return Una cadena que representa el objeto Socio en el formato:
     * "id: [id], nombre: [nombre], edad: [edad]".
     */
    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", edad: " + edad;
    }

    /**
     * Compara este objeto Socio con otro objeto Socio basado en sus IDs.
     *
     * @param otherSocio El objeto Socio a comparar.
     * @return Un valor negativo si el ID de este socio es menor que el ID del otro socio,
     * cero si los IDs son iguales, o un valor positivo si el ID de este socio es mayor.
     */
    @Override
    public int compareTo(Socio otherSocio) {

        int estado = 0;

        if (this.id > otherSocio.id) {
            estado = 1;
        } else if (otherSocio.id > this.id) {
            estado = -1;
        }

        return estado;
    }

}