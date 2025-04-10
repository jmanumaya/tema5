package examen2324mandos;

import java.util.Comparator;

public class ComparaPrecios implements Comparator<Mando>{

	@Override
	public int compare(Mando o1, Mando o2) {
		
		return (int) (o1.getPrecio() - o2.getPrecio());
	}

}
