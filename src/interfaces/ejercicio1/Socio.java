package interfaces.ejercicio1;

// Implementacion interfaz comparable
public class Socio implements Comparable<Socio>{
	
	private int id;
	
	private String nombre;
	
	private int edad;

	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "id: " + id + ", nombre: " + nombre + ", edad: " + edad;
	}

	@Override
	public int compareTo(Socio otherSocio) {
		
		int estado = 0;
		
		if(this.id > otherSocio.id) {
			estado = 1;
		} else if (otherSocio.id > this.id) {
			estado = -1;
		}
		
		return estado;
	}
	
}
