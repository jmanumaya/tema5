package interfaces.ejercicio1;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Socio> {

	@Override
	public int compare(Socio socio1, Socio socio2) {
		return socio2.getEdad() - socio1.getEdad();
	}

}
