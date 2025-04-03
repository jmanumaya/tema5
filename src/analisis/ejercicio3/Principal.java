package analisis.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		/*CUENTA AHORRO*/
		
		Titular josemanuel = new Titular("12345678P", "Jose Manuel", "Maya Hidalgo", 679678765);
		
		Titular julian = new Titular("87654321H", "Julián", "Lorente Marroco", 665896532);
		
		CuentaAhorro cuentaJosema = new CuentaAhorro(1500, josemanuel, 10, 2.5);
		
		System.out.println(cuentaJosema);
		
		cuentaJosema.addTitular(julian);
		
		System.out.println(cuentaJosema);
		
		cuentaJosema.deleteTitular(julian);
		
		System.out.println(cuentaJosema);
		
		System.out.println();
		
		System.out.println("Saldo con Interes: " + cuentaJosema.saldoInteres());
		
		cuentaJosema.restarCuota();
		
		// Aparece el nuevo saldo con la cuota ya restada.
		System.out.println(cuentaJosema);
		
		/*CUENTA AHORRO*/
		
		/*CUENTA CORRIENTE*/
		
		Titular pablo = new Titular("12345432T", "Pablo", "Iglesias Prieto", 123432156);
		
		CuentaCorriente cuentaPablo = new CuentaCorriente(6000, pablo, 2);
		
		System.out.println(cuentaPablo);
		
		//Transacción de pago.
		cuentaPablo.addTransaccion(new Transaccion(15, 9, 2005, "Compra en el Día.", -1.36));
		
		System.out.println(cuentaPablo);
		
		//Transacción de ingreso.
		cuentaPablo.addTransaccion(new Transaccion(1, 10, 2005, "Salario Mensual", 1500));
		
		System.out.println(cuentaPablo);
		
		/*CUENTA CORRIENTE*/

	}

}
