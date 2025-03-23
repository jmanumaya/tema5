package boletin1.ejercicio5;

public abstract class Poligono  {
	
	protected int numeroLados;

	public Poligono(int numeroLados) {
		
		if(numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}
	
	public abstract double area();

	@Override
	public String toString() {
		return "Número de Lados: " + numeroLados;
	}

}
