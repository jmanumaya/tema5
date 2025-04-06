package analisis.ejercicio4;

public class Principal {

	public static void main(String[] args) {
		
		ContactoPersona cont1P = new ContactoPersona("Jose Manuel", 629263572, "15/09/2005");
		
		ContactoPersona cont2P = new ContactoPersona("Jose Manuel", 629263572, "15/09/2005");
		
		ContactoEmpresa cont1E = new ContactoEmpresa("Joyago Games", 629263572, "jmaya07.github.io");
		
		System.out.println(cont1P);
		
		System.out.println("1º ¿Son iguales? -> " + cont1P.equals(cont2P));
		
		cont2P.setNombre("Salmuera");
		
		System.out.println(cont2P);
		
		System.out.println("2º ¿Son iguales? -> " + cont1P.equals(cont2P));
		
		System.out.println(cont1E);

	}

}
