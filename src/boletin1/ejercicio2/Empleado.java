package boletin1.ejercicio2;

/**
 * Clase Empleado que te permite crear un empleado con su nombre.
 */
public class Empleado {
	
	private String nombre;

	/**
	 * Constructor de un objeto empleado usando los datos que se le pasan através de los parametros de entrada.
	 * 
	 * @param nombre nombre del empleado.
	 */
	public Empleado(String nombre) {
		super();
		
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		} else {
			this.nombre = "Sin Nombre";
		}
		
	}

	/**
	 * Metodo para obtener el nombre del empleado.
	 * 
	 * @return nombre nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para introducir el nombre del empleado.
	 * 
	 * @param nombre nombre del empleado
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Metodo toString que devuelve una cadena donde muestra la información del empleado (nombre)
	 * 
	 * @return toString con la informacion del empleado (nombre)
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
}
