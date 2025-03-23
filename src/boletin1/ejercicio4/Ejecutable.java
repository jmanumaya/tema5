package boletin1.ejercicio4;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(250, "blanco", 'A', 40, 35));
        electrodomesticos.add(new Television(500, "negro", 'B', 10, 50, true));
        electrodomesticos.add(new Electrodomestico(150, "azul", 'C', 15));
        electrodomesticos.add(new Lavadora(300, 45));
        electrodomesticos.add(new Television(600, 8));
        electrodomesticos.add(new Electrodomestico(200, 20));

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisiones = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            System.out.println("Precio final del electrodoméstico: " + precioFinal);
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Television) {
                precioTotalTelevisiones += precioFinal;
            }
        }

        System.out.println("\nPrecio total de electrodomésticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de televisiones: " + precioTotalTelevisiones);
    }

}
