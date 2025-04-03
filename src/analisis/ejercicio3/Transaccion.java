package analisis.ejercicio3;

/**
 * Representa una transacción bancaria con información sobre la fecha, concepto e importe.
 */
public class Transaccion {
	
	/**
	 * Día de la transacción.
	 */
	private int dia;
	
	/**
	 * Mes de la transacción.
	 */
	private int mes;
	
	/**
	 * Año de la transacción.
	 */
	private int anno;
	
	/**
	 * Concepto o descripción de la transacción.
	 */
	private String concepto;
	
	/**
	 * Importe de la transacción (puede ser positivo para ingresos o negativo para retiros).
	 */
	private double importe;
	
	/**
	 * Constructor para crear una nueva transacción con la información proporcionada.
	 *
	 * @param dia      Día de la transacción (de 0 a 31).
	 * @param mes      Mes de la transacción (de 1 a 12).
	 * @param anno     Año de la transacción.
	 * @param concepto Concepto o descripción de la transacción.
	 * @param importe  Importe de la transacción.
	 */
	public Transaccion(int dia, int mes, int anno, String concepto, double importe) {
		if (dia >= 0 && dia <= 31 && mes >= 1 && mes <= 12) {
			this.dia = dia;
			this.mes = mes;
		}
		
		this.anno = anno;
		this.concepto = concepto;
		this.importe = importe; // ya controlo si es negativo o positivo (si es positivo es de ingreso y si es negativo de retirada)
	}

	/**
	 * Obtiene el día de la transacción.
	 *
	 * @return El día de la transacción.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Obtiene el mes de la transacción.
	 *
	 * @return El mes de la transacción.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Obtiene el año de la transacción.
	 *
	 * @return El año de la transacción.
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * Obtiene el concepto o descripción de la transacción.
	 *
	 * @return El concepto de la transacción.
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * Obtiene el importe de la transacción.
	 *
	 * @return El importe de la transacción.
	 */
	public double getImporte() {
		return importe;
	}
	
	/**
	 * Devuelve una representación en cadena de la transacción.
	 *
	 * @return Una cadena que representa la transacción.
	 */
	@Override
	public String toString() {
		return "Transacción: " + concepto + "\n" +
		       "Fecha: " + dia + "/" + mes + "/" + anno + "\n" +
		       "Importe: " + importe;
	}
}