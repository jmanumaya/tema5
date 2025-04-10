package examen2324mandos;

public class MandoAspiradora extends Mando implements Velocidad {
	
	private int velocidad = 0;

	public MandoAspiradora(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}

	public MandoAspiradora(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}
	

	public int getVelocidad() {
		return velocidad;
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
		return super.toString() + "\n Información General: \n\t- Velocidad: " + velocidad;
	}
	
	

}
