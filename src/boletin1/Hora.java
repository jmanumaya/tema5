package boletin1;

/**
 * Clase Hora
 */
public class Hora {

	private int hora;
	
	private int minutos;

	/**
	 * Construye objeto con los siguientes datos pasados como parámetros
	 * 
	 * @param hora la hora que es
	 * @param minutos los minutos que son
	 */
	protected Hora(int hora, int minuto) {
		super();
		if (hora >= 0 && hora < 24) {
		this.hora = hora;
		} else {
			throw new IllegalArgumentException("La hora debe comprenderse entre 0 y 23");
		}
		if (minuto >= 0 && minuto < 60) {
		this.minutos = minuto;
		} else {
			throw new IllegalArgumentException("Los minutos deben comprenderse entre 0 y 59");
		}
	}
	
	/**
	 * Metodo que incrementa a uno los minutos.
	 */
	protected void inc() {
		++this.minutos;
		
		if (minutos > 59) {
			++this.hora;
			this.minutos = 0;
			if (this.hora > 23) {
				this.hora = 0;
			}
		}
	}
	
	/**
	 * Metodo que sirve para introducir un minuto determinado por el usuario.
	 * 
	 * @param minuto nuevo minuto a actualizar.
	 * @return estado, True o false según si se ha actualizado correctamente o si no.
	 */
	protected boolean setMinutos(int minuto) {
		
		boolean estado = false;
		
		if (minuto >= 0 && minuto < 60) {
			this.minutos = minuto;
			estado = true;
		}
		
		return estado;
	}
	
	/**
	 * Metodo que sirve para introducir una hora determinada por el usuario.
	 * 
	 * @param hora nueva hora a actualizar.
	 * @return estado, True o false según si se ha actualizado correctamente o si no.
	 */
	protected boolean setHora(int hora) {
		
		boolean estado = false;
		
		if (hora >= 0 && hora < 60) {
			this.hora = hora;
			estado = true;
		}
		
		return estado;
	}
	/**
	 * Método toString para imprimir la hora y minutos actuales.
	 * 
	 * @return String con la hora y minutos actuales.
	 */
	@Override
	public String toString() {
		return this.hora + ":" + this.minutos;
	}

}
