package analisis.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
        Libro libro = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana");
        Revista revista = new Revista(2, "National Geographic", 10, 2023);
        DVD dvd = new DVD(3, "Interestelar", "Christopher Nolan", 2014, "película");

        System.out.println(libro);
        System.out.println("Tiempo de préstamo: " + libro.getTiempoPrestamo() + " días");

        System.out.println(revista);
        System.out.println("Tiempo de préstamo: " + revista.getTiempoPrestamo() + " días");

        System.out.println(dvd);
        System.out.println("Tiempo de préstamo: " + dvd.getTiempoPrestamo() + " días");
        
    }
	
}
