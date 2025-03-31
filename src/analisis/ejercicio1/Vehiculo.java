package analisis.ejercicio1;

public class Vehiculo {
	
	protected String marca;
	
	protected String modelo;
	
	protected String color;
	
	protected String matricula;
	
	protected boolean estadoMotor;
	
	protected int marchaActual;
	
	protected int velocidadActual;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
	}
		
	public void parar() {
		estadoMotor = false;
	}
	
	public void arrancar() {
		estadoMotor = true;
	}
	
	public void subirMarcha() {
		++marchaActual;
	}
	
	public void bajarMarcha() {
		--marchaActual;
	}
}
