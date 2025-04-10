package examen2324mandos;

public class MandoTelevisor extends Mando implements Volumen{
	

	private int volumen = 0;
	
	private int canal = 1;
	
	public MandoTelevisor(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}
	
	public MandoTelevisor(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}
	
	

	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}
	

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void subirCanal() {
		++canal;
	}
	
	public void bajarCanal() {
		--canal;
	}

	@Override
	public void subirVolumen() {
		
		volumen += 5;
	}

	@Override
	public void bajarVolumen() {
		
		volumen -= 5;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Información General: \n\t- Volumen: " + volumen + "\n\t- Canal: " + canal;
	}
	
}
