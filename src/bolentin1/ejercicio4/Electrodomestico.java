package bolentin1.ejercicio4;

public class Electrodomestico {
	
	private double precioBase = 5;
	
	private Colores color = Colores.valueOf("BLANCO");
	
	private enum Colores {BLANCO, NEGRO, ROJO, AZUL, GRIS};
	
	private enum Consumo {A, B, C, D, E, F};
	
	private Consumo consumoEnergetico = Consumo.valueOf("F");

	private int peso = 100;

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {

		this.precioBase = precioBase;
		
		if(comprobarColor(color)) {
			this.color = Colores.valueOf(color);
		}
		
		if(comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = Consumo.valueOf(String.valueOf(consumoEnergetico)); 
		}
		
		this.peso = peso;
		
	}

	public Electrodomestico(double precioBase, int peso) {
		
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(Consumo consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	private boolean comprobarConsumoEnergetico(char letra) {
		
		boolean estado;
		
		switch (letra) {
		
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			estado = true;
		}
		
		default -> { estado = false; }
		}
		
		return estado;
		
	}
	
	private boolean comprobarColor(String color) {
		
		boolean estado;
		
		switch (color.toUpperCase()) {
		
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			estado = true;
		}
		
		default -> { estado = false; }
		}
		
		return estado;
		
	}
	
	private void precioFinal() {
		
		switch (consumoEnergetico) {
		
			case A -> {
				precioBase += 100;
			}
			
			case B -> {
				precioBase += 80;
			}
			
			case C -> {
				precioBase += 60;
			}
			
			case D -> {
				precioBase += 50;
			}
			
			case E -> {
				precioBase += 30;
			}
			
			default -> {
				precioBase += 10;
			}
		
		}
		
		if(peso > 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else {
			precioBase += 100;
		}
	}
	
	/*
	public Electrodomestico() {
		this(100, Colores.valueOf("BLANCO"), Consumo.valueOf("F"), 5);
	}
	*/

}
