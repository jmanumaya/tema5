package interfaces.ejercicio2;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Futbolista>{
	
	/**
	 * Comparador para ordenar futbolistas por edad de forma ascendente
	 */
	@Override
	public int compare(Futbolista fut1, Futbolista fut2) {
		return Integer.compare(fut1.getEdad(), fut2.getEdad());
	}

}
