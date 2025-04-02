package comparator.ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Random rd = new Random();
		
		Integer[] numeros = new Integer[20];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rd.nextInt(0, 101);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros, new ComparaNumeros());
		
		System.out.println(Arrays.toString(numeros));
		
	}

}
