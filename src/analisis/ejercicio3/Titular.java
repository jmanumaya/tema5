package analisis.ejercicio3;

import java.util.*;

/**
 * Representa a un titular de una cuenta bancaria con información personal como DNI, nombre, apellidos y teléfono.
 * 
 * Implementa la interfaz Comparable para ordenar por defecto los titulares por DNI en orden ascendente.
 */
public class Titular implements Comparable<Titular>{
	
	/**
	 * Documento Nacional de Identidad del titular.
	 */
	private String dni;
	
	/**
	 * Nombre del titular.
	 */
	private String nombre;
	
	/**
	 * Apellidos del titular.
	 */
	private String apellidos;
	
	/**
	 * Número de teléfono del titular.
	 */
	private int telefono;

	/**
	 * Constructor para crear un nuevo titular con la información personal proporcionada.
	 *
	 * @param dni       Documento Nacional de Identidad del titular.
	 * @param nombre    Nombre del titular.
	 * @param apellidos Apellidos del titular.
	 * @param telefono  Número de teléfono del titular.
	 */
	public Titular(String dni, String nombre, String apellidos, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	/**
	 * Obtiene el DNI del titular.
	 *
	 * @return El DNI del titular.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Obtiene el nombre del titular.
	 *
	 * @return El nombre del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del titular.
	 *
	 * @param nombre El nuevo nombre del titular.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene los apellidos del titular.
	 *
	 * @return Los apellidos del titular.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Establece los apellidos del titular.
	 *
	 * @param apellidos Los nuevos apellidos del titular.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene el número de teléfono del titular.
	 *
	 * @return El número de teléfono del titular.
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Establece el número de teléfono del titular.
	 *
	 * @param telefono El nuevo número de teléfono del titular.
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	/**
	 * Compara dos titulares para determinar si son iguales (tienen el mismo DNI).
	 *
	 * @param obj Objeto a comparar.
	 * @return true si los titulares son iguales, false de lo contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		Titular other = (Titular) obj;
		return dni.equals(other.dni);
	}

	/**
	 * Devuelve una representación en cadena del titular.
	 *
	 * @return Una cadena que representa al titular.
	 */
	@Override
	public String toString() {
		return "Titular don/dña " + apellidos + ", " + nombre + ", con DNI " + dni + " y número telefónico " + telefono;
	}
	
	/**
	 * Compara este titular con otro segun el DNI en orden ascendente.
	 *
	 * @param other El otro titular a comparar
	 * @return Un valor negativo, cero o positivo según el orden por DNI.
	 */
	@Override
	public int compareTo(Titular other) {
		return dni.compareTo(other.dni);
	}

}