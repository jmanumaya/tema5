package analisis.ejercicio1;

public class Camion extends Vehiculo {
	
	protected int pesoMaximoAutorizado;
	
	protected boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula, int pesoMaximoAutorizado, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		
		this.pesoMaximoAutorizado = pesoMaximoAutorizado;
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	

}
