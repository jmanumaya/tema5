package interfaces.ejercicio2;

import java.util.Comparator;

public class ComparaGoles implements Comparator<Futbolista>{
	
	/**
	 * Comparador para ordenar los futbolistas de mas a menos goles
	 */
	@Override
	public int compare(Futbolista fut1, Futbolista fut2) {
		return Integer.compare(fut2.getNumeroGoles(), fut1.getNumeroGoles());
	}

}
