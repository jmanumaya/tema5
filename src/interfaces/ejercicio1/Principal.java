package interfaces.ejercicio1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		Socio s1 = new Socio(1, "Jose", 15);
		
		Socio s2 = new Socio(2, "Juliano", 10);

		Socio s3 = new Socio(7, "Pablo", 11);
		
		
		socios.add(s1);
		socios.add(s2);
		socios.add(s3);
		
		Collections.sort(socios);
		
		System.out.println(socios);
		
		Collections.sort(socios, new ComparaNombres());
		
		System.out.println(socios);
		
		Collections.sort(socios, new ComparaEdad());
		
		System.out.println(socios);
		
		/*LAMBDA*/
		
		Collections.sort(socios, (a, b) -> a.getNombre().compareTo(b.getNombre()));
		
		System.out.println(socios);

	}

}
