package analisis.ejercicio1;

public class Turismo extends Vehiculo{
	

	protected int numeroPlazas;
	
	private enum tipoUso {PROFESIONAL, PARTICULAR};
	
	protected tipoUso uso;

	public Turismo(String marca, String modelo, String color, String matricula, int numeroPlazas, String uso) {
		super(marca, modelo, color, matricula);
		
		this.numeroPlazas = numeroPlazas;
		
		switch (uso.toUpperCase()) {
		case "PROFESIONAL", "PARTICULAR" -> this.uso = tipoUso.valueOf(uso.toUpperCase());
		default -> { this.uso = tipoUso.valueOf("PARTICULAR"); }
		}
	}
	
	

}
