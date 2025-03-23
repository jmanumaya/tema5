package boletin1.ejercicio5;

public class Triangulo extends Poligono{
	
	private double lado1 = 1;
	
	private double lado2 = 1;
	
	private double lado3 = 1;
	
	public Triangulo() {
		super(3);
	}

	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	@Override
	public double area() {
		
		if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
	        throw new IllegalArgumentException("Los lados no forman un triángulo válido");
	    }
		
	    double s = (lado1 + lado2 + lado3) / 2; // Semiperímetro
	    return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}

	@Override
	public String toString() {
		return "Tipo: Triangulo, Lado 1: " + lado1 + ", Lado 2: " + lado2 + ", Lado 3: " + lado3;
	}

}
