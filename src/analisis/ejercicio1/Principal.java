package analisis.ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Crear un turismo
		Turismo turismo = new Turismo("Seat", "Ibiza", "Rojo", "1234ABC", 5, "Particular");

		int velocidadMaxima;

		// Simulación
		turismo.mostrarInformacion();
		turismo.arrancar();

		System.out.print("Introduce la velocidad máxima: ");
		velocidadMaxima = scanner.nextInt();

		// Acelerar y subir marchas
		for (int velocidad = 0; velocidad <= velocidadMaxima; velocidad += 10) {
			turismo.acelerar(velocidad);
		}

		System.out.print("Introduce el tiempo de mantenimiento de la velocidad (segundos): ");
		int tiempoMantenimiento = scanner.nextInt();

		// Mantener la velocidad
		try {
			Thread.sleep(tiempoMantenimiento * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Desacelerar y bajar marchas
		for (int velocidad = velocidadMaxima; velocidad >= 0; velocidad -= 10) {
			turismo.desacelerar(velocidad);
		}

		turismo.bajarMarcha(); // Punto muerto
		turismo.parar();
		turismo.mostrarInformacion();

		scanner.close();
	}

}
