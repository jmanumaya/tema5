package interfaces.ejercicio3;

public class Principal {
	
	public static void main(String[] args) {
		
		Perro perro = new Perro("Max", "Labrador", 25.0, "Dorado");
        Gato gato = new Gato("Misty", "Siames", 4.0, "Blanco");

        perro.comer();
        perro.dormir();
        perro.hacerRuido();
        System.out.println(perro.hacerCaso() ? perro.nombre + " hace caso" : perro.nombre + " no hace caso");
        perro.sacarPaseo();
        perro.vacunar();

        gato.comer();
        gato.dormir();
        gato.hacerRuido();
        System.out.println(gato.hacerCaso() ? gato.nombre + " hace caso" : gato.nombre + " no hace caso");
        gato.toserBolaPelo();
        gato.vacunar();
		
	}

}
