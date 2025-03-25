package interfaces.ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Socio s1 = new Socio(1, "Jose", 15);
		
		Socio s2 = new Socio(2, "Juliano", 10);

		Socio s3 = new Socio(7, "Pablo", 11);
		
		Socio tabla[] = {s1, s2, s3};
		
		Arrays.sort(tabla);
		
		for(Socio sc : tabla) {
			System.out.println(sc);
		}
	}

}
