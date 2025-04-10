package examen2324mandos;

public class MandoMinicadena extends Mando implements Volumen{
	

	private int volumen = 0;
	
	public MandoMinicadena(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}

	public MandoMinicadena(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}
	
	

	public int getVolumen() {
		return volumen;
	}
	

	@Override
	public void subirVolumen() {

		volumen += 10;
	}

	@Override
	public void bajarVolumen() {

		volumen -= 10;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Información General: \n\t- Volumen: " + volumen;
	}
	

}
