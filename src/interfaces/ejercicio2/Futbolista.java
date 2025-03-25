package interfaces.ejercicio2;

import java.util.Objects;

public class Futbolista implements Comparable <Futbolista>{
	
	private int numeroCamiseta;
	
	private String nombre;

	private int edad;
	
	private int numeroGoles;

	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		this.numeroCamiseta = numeroCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numeroGoles = numeroGoles;
	}
	
	@Override
	public int compareTo(Futbolista otherFutbolista) {
		
		int estado = 0;
		
//		if(numeroCamiseta != otherFutbolista.numeroCamiseta) {
//			
//			if (numeroCamiseta > otherFutbolista.numeroCamiseta) {
//				estado = 1;
//			} else if (otherFutbolista.numeroCamiseta > numeroCamiseta){
//				estado = -1;
//			}
//			
//		} else if (!nombre.equals(otherFutbolista.nombre)){
//			
//			if (nombre > otherFutbolista.nombre) {
//				estado = 1;
//			} else if (otherFutbolista.numeroCamiseta > numeroCamiseta){
//				estado = -1;
//			}
//			
//		}
//		
//		if(this.id > otherFutbolista.id) {
//			estado = 1;
//		} else if (otherFutbolista.id > this.id) {
//			estado = -1;
//		}
		estado=numeroCamiseta-otherFutbolista.numeroCamiseta;
		if(estado==0) {
			estado=this.nombre.compareTo(otherFutbolista.nombre);
		}
		
		return estado;
	}

	@Override
	public String toString() {
		return "Futbolista [numeroCamiseta=" + numeroCamiseta + ", nombre=" + nombre + ", edad=" + edad
				+ ", numeroGoles=" + numeroGoles + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numeroCamiseta);
	}

	@Override
	public boolean equals(Object obj) {
		
		Futbolista other = (Futbolista) obj;
		
		return nombre.equals(other.nombre) && numeroCamiseta == other.numeroCamiseta;
	}
	
}
