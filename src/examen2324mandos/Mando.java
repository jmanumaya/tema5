package examen2324mandos;

import java.util.*;

public class Mando implements Comparable<Mando>{
	
	private String modelo;
	
	private double anchura;
	
	private double altura;
	
	private double precio;
	
	private boolean encendido = false;

	public Mando(String modelo, double anchura, double altura) {
		this.modelo = modelo;
		this.anchura = anchura;
		this.altura = altura;
	}
	
	public Mando (String modelo, double anchura, double altura, double precio) {
		this(modelo, anchura, altura);
		this.precio = precio;	
	}

	public String getModelo() {
		return modelo;
	}

	public double getAnchura() {
		return anchura;
	}

	public double getAltura() {
		return altura;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void onOff() {
		encendido = !encendido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}

	@Override
	public boolean equals(Object obj) {
		
		Mando other = (Mando) obj;
		
		return modelo.equals(other.modelo);
	}
	
	public int compareTo(Mando mando2) {
		return modelo.compareTo(mando2.modelo);
	}

	@Override
	public String toString() {
		return "Mando -> " + modelo + ", anchura: " + anchura + ", altura: " + altura + ", precio: " + precio + ", estado: " + encendido;
	}
	
	
	
}
