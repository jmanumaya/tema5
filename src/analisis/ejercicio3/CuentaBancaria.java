package analisis.ejercicio3;

import java.util.*;

/**
 * Representa una cuenta bancaria con un número de cuenta único, saldo, y una lista de titulares.
 */
public class CuentaBancaria {
	
	/**
	 * Contador estático para generar números de cuenta únicos.
	 */
	private static int  numCuentaGeneral = 0;
	
	/**
	 * Número único de la cuenta.
	 */
	private int numCuenta;
	
	/**
	 * Saldo actual de la cuenta.
	 */
	private double saldo;
	
	/**
	 * Número actual de titulares de la cuenta.
	 */
	private int numTitulares = 1;
	
	/**
	 * Lista de titulares de la cuenta.
	 */
	private List<Titular> titulares = new ArrayList<>();

	/**
	 * Constructor para crear una nueva cuenta bancaria con un saldo inicial y un titular.
	 *
	 * @param saldo   Saldo inicial de la cuenta. Si es negativo, se establece a 0.
	 * @param titular Titular inicial de la cuenta.
	 */
	public CuentaBancaria(double saldo, Titular titular) {
		
		++numCuentaGeneral;
		this.numCuenta = numCuentaGeneral;
		if(saldo >= 0) {
			this.saldo = saldo;
		} else {
			this.saldo = 0;
		}
		titulares.add(titular);
	}

	/**
	 * Obtiene el número de cuenta.
	 *
	 * @return El número de cuenta.
	 */
	public int getNumCuenta() {
		return numCuenta;
	}

	/**
	 * Obtiene el saldo actual de la cuenta.
	 *
	 * @return El saldo actual.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Obtiene el número de titulares de la cuenta.
	 *
	 * @return El número de titulares.
	 */
	public int getNumTitulares() {
		return numTitulares;
	}

	/**
	 * Obtiene la lista de titulares de la cuenta.
	 *
	 * @return La lista de titulares.
	 */
	public List<Titular> getTitulares() {
		return titulares;
	}
	
	/**
	 * Ingresa una cantidad de dinero en la cuenta.
	 *
	 * @param dinero Cantidad de dinero a ingresar.
	 * @return true si el ingreso fue exitoso (dinero >= 0), false de lo contrario.
	 */
	public boolean ingresar(double dinero) {
		
		boolean res = false;
		
		if(dinero >= 0) {
			saldo += dinero;
			res = true;
		} 
		
		return res;
	}
	
	/**
	 * Retira una cantidad de dinero de la cuenta.
	 *
	 * @param dinero Cantidad de dinero a retirar.
	 * @return true si el retiro fue exitoso (dinero <= saldo), false de lo contrario.
	 */
	public boolean retirar(double dinero) {
		
		boolean res = false;
		
		if(dinero <= saldo) {
			saldo -= dinero;
			res = true;
		} 
		
		return res;
	}
	
	/**
	 * Realiza un pago desde o hacia la cuenta.
	 *
	 * @param dinero Cantidad de dinero a pagar. Si es negativo, se considera un ingreso.
	 */
	public void pagar(double dinero) {
		if(dinero < 0) {
			saldo += dinero;
		} else {
			saldo -= dinero;
		}
	}
	
	/**
	 * Añade un titular a la cuenta.
	 *
	 * @param titular Titular a añadir.
	 * @return true si el titular fue añadido con éxito (número de titulares < 3), false de lo contrario.
	 */
	public boolean addTitular(Titular titular) {
		boolean res = false;
		
		if (numTitulares < 3) {
			titulares.add(titular);
			++numTitulares;
			res = true;
		}
		
		return res;
	}
	
	/**
	 * Elimina un titular de la cuenta.
	 *
	 * @param titular Titular a eliminar.
	 * @return true si el titular fue eliminado con éxito, false de lo contrario.
	 */
	public boolean deleteTitular(Titular titular) {
		boolean res = false;
		
		if (titulares.remove(titular)) {
			--numTitulares;
			res = true;
		}
		
		return res;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(numCuenta);
	}

	/**
	 * Compara dos cuentas bancarias para determinar si son iguales (tienen el mismo número de cuenta).
	 *
	 * @param obj Objeto a comparar.
	 * @return true si las cuentas son iguales, false de lo contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		CuentaBancaria other = (CuentaBancaria) obj;
		return numCuenta == other.numCuenta;
	}
	
	/**
	 * Devuelve una representación en cadena de la cuenta bancaria.
	 *
	 * @return Una cadena que representa la cuenta bancaria.
	 */
	@Override
	public String toString() {
		String mensaje = "Número de cuenta: " + numCuenta + "\nSaldo: " + saldo + "\nNúmero de titulares: " + numTitulares + "\nTitulares:";
		
		for (Titular titular : titulares) {
			mensaje += "\n";
			mensaje += titular.toString();
		}
		
		return mensaje;
	}

	
}