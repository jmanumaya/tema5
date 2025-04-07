package interfaces.ejercicio2;

import java.util.Objects;

/**
 * La clase Futbolista representa a un jugador de fútbol.
 * Implementa la interfaz Comparable para permitir la comparación de objetos Futbolista
 * basada en su número de camiseta y nombre.
 */
public class Futbolista implements Comparable<Futbolista> {

    /**
     * Número de camiseta del futbolista.
     */
    private int numeroCamiseta;

    /**
     * Nombre del futbolista.
     */
    private String nombre;

    /**
     * Edad del futbolista.
     */
    private int edad;

    /**
     * Número de goles marcados por el futbolista.
     */
    private int numeroGoles;

    /**
     * Constructor para crear un nuevo objeto Futbolista.
     *
     * @param numeroCamiseta El número de camiseta del futbolista.
     * @param nombre         El nombre del futbolista.
     * @param edad           La edad del futbolista.
     * @param numeroGoles    El número de goles marcados por el futbolista.
     */
    public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }
    
    

    public int getNumeroCamiseta() {
		return numeroCamiseta;
	}



	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
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



	public int getNumeroGoles() {
		return numeroGoles;
	}



	public void setNumeroGoles(int numeroGoles) {
		this.numeroGoles = numeroGoles;
	}



	/**
     * Compara este objeto Futbolista con otro objeto Futbolista.
     * Primero compara por número de camiseta y, si son iguales, compara por nombre.
     *
     * @param otherFutbolista El objeto Futbolista a comparar.
     * @return Un valor negativo si este futbolista es menor, cero si son iguales,
     * o un valor positivo si este futbolista es mayor.
     */
    @Override
    public int compareTo(Futbolista otherFutbolista) {

        int estado = 0;

        estado = numeroCamiseta - otherFutbolista.numeroCamiseta;

        if (estado == 0) {
            estado = this.nombre.compareTo(otherFutbolista.nombre);
        }

        return estado;
    }

    /**
     * Devuelve una representación en cadena del objeto Futbolista.
     *
     * @return Una cadena que representa el objeto Futbolista en el formato:
     * "[nombre], Número [numeroCamiseta] con [numeroGoles] goles y [edad] años.".
     */
    @Override
    public String toString() {
        return nombre + ", Número " + numeroCamiseta + " con " + numeroGoles + " goles y " + edad + " años.";
    }

    /**
     * Calcula el código hash del objeto Futbolista basado en su nombre y número de camiseta.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroCamiseta);
    }

    /**
     * Compara este objeto Futbolista con otro objeto para verificar si son iguales.
     * Dos futbolistas se consideran iguales si tienen el mismo nombre y número de camiseta.
     *
     * @param obj El objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {

        Futbolista other = (Futbolista) obj;

        return nombre.equals(other.nombre) && numeroCamiseta == other.numeroCamiseta;
    }

}