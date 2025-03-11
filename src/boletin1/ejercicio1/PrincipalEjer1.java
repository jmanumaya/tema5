package boletin1.ejercicio1;

public class PrincipalEjer1 {

	public static void main(String[] args) {
		
		// Pruebas de ambas clases...
		
		/*Clase Hora (Padre)*/
		
		Hora tiempo = new Hora(1, 2);

		System.out.println(tiempo);
		
		tiempo.inc();
		
		System.out.println(tiempo);
		
		tiempo.setMinutos(59);
		
		System.out.println(tiempo);
		
		tiempo.inc();
		
		System.out.println(tiempo);
		
		/*Clase Hora (Padre)*/
		
		/*Clase HoraExacta (Hija)*/
		
		HoraExacta tiempoExacto = new HoraExacta(1, 10, 20);
		
		System.out.println(tiempoExacto);
		
		tiempoExacto.inc();
		
		System.out.println(tiempoExacto);
		
		tiempoExacto.setSegundo(59);
		
		System.out.println(tiempoExacto);
		
		tiempoExacto.inc();
		
		System.out.println(tiempoExacto);
		
		tiempoExacto.setMinutos(59);
		
		tiempoExacto.setSegundo(59);
		
		tiempoExacto.inc();
		
		System.out.println(tiempoExacto);
		
		System.out.println(tiempoExacto.setMinutos(30));
		
		/*Clase HoraExacta (Hija)*/
	}

}
