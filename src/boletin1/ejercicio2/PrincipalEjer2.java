package boletin1.ejercicio2;

public class PrincipalEjer2 {

	public static void main(String[] args) {
		
		/* Pruebas */
		
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
		
		OP1.setNombre("Jose Manuel");
		
		System.out.println(OP1);

		/* Pruebas */
	}

}
