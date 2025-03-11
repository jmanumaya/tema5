package boletin1.ejercicio2;

public class Directivo extends Empleado{

	/**
	 * Constructor que crea un objeto Directivo usando a su vez el constructor de la clase padre (Empleado)
	 * utilizando el dato nombre como parametro de entrada.
	 * 
	 * @param nombre nombre del Empleado Directivo
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Metodo toString que construlle una cadena con la informacion del Empleado, mostrando su nombre
	 * usando el toString de la clase padre (Empleado) añadiendole el rol de directivo.
	 * 
	 * @return String ya formado con la informacion del Empleado Directivo.
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
	
}
