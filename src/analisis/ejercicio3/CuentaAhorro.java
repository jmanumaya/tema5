package analisis.ejercicio3;

/**
 * Representa una cuenta de ahorro, que extiende la clase CuentaBancaria, con características adicionales como cuota de mantenimiento e interés anual.
 */
public class CuentaAhorro extends CuentaBancaria {
	
	/**
	 * Cuota de mantenimiento mensual de la cuenta de ahorro.
	 */
	private double cuotaMantenimiento;
	
	/**
	 * Interés anual aplicado a la cuenta de ahorro.
	 */
	private double interesAnual;

	/**
	 * Constructor para crear una nueva cuenta de ahorro con saldo inicial, titular, cuota de mantenimiento e interés anual.
	 *
	 * @param saldo             Saldo inicial de la cuenta de ahorro.
	 * @param titular           Titular de la cuenta de ahorro.
	 * @param cuotaMantenimiento Cuota de mantenimiento mensual de la cuenta.
	 * @param interesAnual      Interés anual aplicado a la cuenta.
	 */
	public CuentaAhorro(double saldo, Titular titular, double cuotaMantenimiento, double interesAnual) {
		super(saldo, titular);
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}
	
	/**
	 * Obtiene la cuota de mantenimiento mensual de la cuenta de ahorro.
	 *
	 * @return La cuota de mantenimiento mensual.
	 */
	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	/**
	 * Establece la cuota de mantenimiento mensual de la cuenta de ahorro.
	 *
	 * @param cuotaMantenimiento La nueva cuota de mantenimiento mensual.
	 */
	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	/**
	 * Obtiene el interés anual aplicado a la cuenta de ahorro.
	 *
	 * @return El interés anual.
	 */
	public double getInteresAnual() {
		return interesAnual;
	}

	/**
	 * Establece el interés anual aplicado a la cuenta de ahorro.
	 *
	 * @param interesAnual El nuevo interés anual.
	 */
	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	/**
	 * Calcula el saldo de la cuenta después de aplicar el interés anual.
	 *
	 * @return El saldo con el interés anual aplicado.
	 */
	public double saldoInteres() {
	    double saldoActual = super.getSaldo();
	    return saldoActual + (saldoActual * (interesAnual / 100));
	}
	
	/**
	 * Resta la cuota de mantenimiento del saldo de la cuenta.
	 */
	public void restarCuota() {
		super.pagar(cuotaMantenimiento);
	}

	/**
	 * Devuelve una representación en cadena de la cuenta de ahorro, incluyendo los datos de la cuenta bancaria base y los datos adicionales de la cuenta de ahorro.
	 *
	 * @return Una cadena que representa la cuenta de ahorro.
	 */
	@Override
	public String toString() {
		return "\n" + super.toString() + "\nDatos Adicionales:\n" + "Cuota de Mantenimiento: " + cuotaMantenimiento + "\nInteres Anual: " + interesAnual;
	}
	
	
}