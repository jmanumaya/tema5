package boletin1.ejercicio3;

public class Perecedero extends Producto{
	
	private int diasACalcular;

	public Perecedero(String nombre, Double precio, int diasACalcular) {
		super(nombre, precio);
		this.diasACalcular = diasACalcular;
	}

	public int getDiasACalcular() {
		return diasACalcular;
	}

	public void setDiasACalcular(int diasACalcular) {
		this.diasACalcular = diasACalcular;
	}

	@Override
	public String toString() {
		return "Perecedero [diasACalcular=" + diasACalcular + "]";
	}

}
