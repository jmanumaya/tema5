package comparator.ejercicio1;

import java.util.*;

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
		
		
		/*USANDO EXPRESION LAMBDA*/
		
        // Creo una tabla que almacenará 20 números aleatorios (Integer para que me deje usar el comparator)
        Integer[] numeros2 = new Integer[20]; 
        Random random = new Random();

        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = random.nextInt(100) + 1;
        }

        System.out.println("Tabla original: " + Arrays.toString(numeros2));

        // Ordeno el array en sentido decreciente utilizando una expresión lambda con Arrays.sort()
        Arrays.sort(numeros2, (num1, num2) -> num2.compareTo(num1));

        System.out.println("Tabla ordenada (decreciente): " + Arrays.toString(numeros2));
		
	}

}
