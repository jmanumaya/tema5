package analisis.ejercicio3;

import java.util.*;

/**
 * Representa una cuenta corriente, que extiende la clase CuentaBancaria, con características adicionales como porcentaje por transacción y lista de transacciones.
 */
public class CuentaCorriente extends CuentaBancaria {

	/**
	 * Porcentaje aplicado a cada transacción en la cuenta corriente.
	 */
	private double porcentajeTransaccion;
	
	/**
	 * Número total de transacciones realizadas en la cuenta corriente.
	 */
	private int numTransacciones = 0;
	
	/**
	 * Lista de transacciones realizadas en la cuenta corriente.
	 */
	private List<Transaccion> transacciones = new ArrayList<>();

	/**
	 * Constructor para crear una nueva cuenta corriente con saldo inicial, titular y porcentaje por transacción.
	 *
	 * @param saldo                Saldo inicial de la cuenta corriente.
	 * @param titular              Titular de la cuenta corriente.
	 * @param porcentajeTransaccion Porcentaje aplicado a cada transacción (se debe proporcionar como un valor entre 0 y 100).
	 */
	public CuentaCorriente(double saldo, Titular titular, double porcentajeTransaccion) {
		super(saldo, titular);
		this.porcentajeTransaccion = porcentajeTransaccion / 100.0;
	}
	
	/**
	 * Obtiene el porcentaje aplicado a cada transacción.
	 *
	 * @return El porcentaje por transacción.
	 */
	public double getPorcentajeTransaccion() {
		return porcentajeTransaccion;
	}

	/**
	 * Establece el porcentaje aplicado a cada transacción.
	 *
	 * @param porcentTransac El nuevo porcentaje por transacción (se debe proporcionar como un valor entre 0 y 100).
	 */
	public void setPorcentajeTransaccion(double porcentTransac) {
		porcentajeTransaccion = porcentTransac / 100.0;
	}

	/**
	 * Obtiene el número total de transacciones realizadas en la cuenta corriente.
	 *
	 * @return El número de transacciones.
	 */
	public int getNumTransacciones() {
		return numTransacciones;
	}

	/**
	 * Añade una transacción a la cuenta corriente, aplicando el porcentaje por transacción al importe.
	 *
	 * @param transaccion Transacción a añadir.
	 * @return true si la transacción fue añadida con éxito, false de lo contrario.
	 */
	public boolean addTransaccion(Transaccion transaccion) {
	    boolean res = false;
	    
	    double importe = transaccion.getImporte();
	    
	    double importeConComision;

	    if (transacciones.add(transaccion)) {
	    	
	        if (importe < 0) { // Es un pago
	            importeConComision = importe - (importe * porcentajeTransaccion); // Restamos la comisión
	            super.pagar(importeConComision);
	            
	        } else { // Es un ingreso
	            importeConComision = importe - (importe * porcentajeTransaccion); // Aplicamos la comisión
	            super.ingresar(importeConComision);
	        }
	        
	        ++numTransacciones;
	        res = true;
	    }
	    
	    return res;
	}
	
	/**
	 * Devuelve una representación en cadena de la cuenta corriente, incluyendo los datos de la cuenta bancaria base, los datos adicionales de la cuenta corriente y la lista de transacciones.
	 *
	 * @return Una cadena que representa la cuenta corriente.
	 */
	@Override
	public String toString() {
		
		String mensaje = "\n" + super.toString() + "\nDatos Adicionales:\n" + "Porcentaje por Transacción: " + porcentajeTransaccion + "\nNúmero de Transacciones: " + numTransacciones;
		
			if(transacciones.size() > 0) {
				mensaje += "\nTransacciones:";
				for (Transaccion transaccion : transacciones) {
					mensaje += "\n---------------------------\n";
					mensaje += transaccion.toString();
					mensaje += "\n---------------------------";
				};
			} else {
				mensaje += "\n";
				mensaje += "Aún no hay transacciones en la cuenta";
			}
		return mensaje;
	}
	
	
}