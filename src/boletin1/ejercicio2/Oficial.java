package boletin1.ejercicio2;

public class Oficial extends Operario{

	/**
	 * Constructor que crea un objeto Oficial usando a su vez el constructor de la clase padre (Operario)
	 * utilizando el dato nombre como parametro de entrada.
	 * 
	 * @param nombre nombre del Empleado Operario Oficial
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * Metodo toString que construlle una cadena con la informacion del Empleado, mostrando su nombre
	 * usando el toString de la clase padre (Operario) añadiendole el rol de Oficial.
	 * 
	 * @return String ya formado con la informacion del Empleado Operario Oficial.
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}

	
}
