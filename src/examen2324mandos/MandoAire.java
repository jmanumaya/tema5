package examen2324mandos;

public class MandoAire extends Mando implements Velocidad{
	
	enum Modo {FRIO, CALOR}

	private Modo modo = Modo.FRIO;
	
	private int temperatura = 22;
	
	private int velocidad = 0;
	
	public MandoAire(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}

	public MandoAire(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	public Modo getModo() {
		return modo;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public void cambiarModo() {
		
		switch (modo) {
		
		case FRIO -> {modo = Modo.CALOR;}
		default -> {modo = Modo.FRIO;}
		}
	}
	
	public void subirTemperatura() {
		++temperatura;
	}
	
	public void bajarTemperatura() {
		--temperatura;
	}

	@Override
	public void subirVelocidad() {
		++velocidad;
		
	}

	@Override
	public void bajarVelocidad() {
		--velocidad;
		
	}

	@Override
	public String toString() {
		return super.toString() + "\n Información General: \n\t- Modo: " + modo + "\n\t- Temperatura: " + temperatura + "\n\t- Velocidad de Ventilador: " + velocidad;
	}

	
}
