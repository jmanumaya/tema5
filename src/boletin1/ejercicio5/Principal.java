package boletin1.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

		static Scanner scanner = new Scanner(System.in);
		static ArrayList<Poligono> poligonos = new ArrayList<>();
		
	public static void main(String[] args) {


        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir triángulo");
            System.out.println("2. Introducir rectángulo");
            System.out.println("3. Mostrar polígonos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> introducirTriangulo();
                case 2 -> introducirRectangulo();
                case 3 -> mostrarPoligonos();
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 4);
        
	}

    // Opción 1: Introducir Triángulo
    public static void introducirTriangulo() {
        System.out.print("Introduce el lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Introduce el lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Introduce el lado C: ");
        double ladoC = scanner.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            poligonos.add(new Triangulo(ladoA, ladoB, ladoC));
            System.out.println("Triángulo agregado correctamente.");
        } else {
            System.out.println("Los lados no forman un triángulo válido.");
        }
    }

    // Opción 2: Introducir Rectángulo
    public static void introducirRectangulo() {
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = scanner.nextDouble();

        poligonos.add(new Rectangulo(base, altura));
        System.out.println("Rectángulo agregado correctamente.");
    }

    // Opción 3: Mostrar Polígonos
    public static void mostrarPoligonos() {
        if (poligonos.isEmpty()) {
            System.out.println("No hay polígonos almacenados.");
        } else {
            System.out.println("\nLista de polígonos:");
            for (Poligono p : poligonos) {
                System.out.println(p);
            }
        }
	}

}
