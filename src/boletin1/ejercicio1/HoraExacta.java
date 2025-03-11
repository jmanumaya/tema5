package boletin1.ejercicio1;

public class HoraExacta extends Hora{
	

	private int segundos;
	
	/**
	 * Constructor para crear un objeto con los datos pasados como parámetros.
	 * 
	 * @param hora la hora que es
	 * @param minutos los minutos que son
	 * @param segundos los segundos que son
	 */
	HoraExacta(int hora, int minuto, int segundos) {
		super(hora, minuto);
		
		if (segundos >= 0 && segundos < 60) {
			this.segundos = segundos;
		} else {
			throw new IllegalArgumentException("Los segundos deben comprenderse entre 0 y 59");
		}
	}
	
	/**
	 * Metodo para introducir el segundo que es.
	 * 
	 * @param segundo el segundo que es.
	 * @return estado, True o false en función si se ha podido establecer el cambio o no.
	 */
	boolean setSegundo(int segundo) {
		
		boolean estado = false;
		
		if (segundo >= 0 && segundo < 60) {
			this.segundos = segundo;
			estado = true;
		}
		
		return estado;
	}
	
	/**
	 * Metodo que incrementa en uno los segundos y hace uso del metodo inc de la clase padre Hora.
	 */
	protected void inc() {
		
		++this.segundos;
		
		if (this.segundos > 59) {
			super.inc();
			this.segundos = 0;
		}
	}

	/**
	 * ToString que devuelve un String con la representacion de la hora 
	 * haciendo uso del propio toString de la clase padre
	 * 
	 * @return String con la representacion de la hora.
	 */
	@Override
	public String toString() {
		return super.toString() + ":" + this.segundos;
	}
	
}
