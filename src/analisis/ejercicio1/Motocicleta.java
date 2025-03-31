package analisis.ejercicio1;

public class Motocicleta extends Vehiculo{
	

	protected int cilindrada;
	
	protected boolean requiereCarnet = false;
	
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		
		this.cilindrada = cilindrada;
		requiereCarnet();
	}
	
	
	private void requiereCarnet() {
		if(cilindrada >= 125) {
			requiereCarnet = true;
		}
	}

}
