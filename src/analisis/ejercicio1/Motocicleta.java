package analisis.ejercicio1;

/**
 * Clase que representa una motocicleta, un tipo de vehículo.
 * Hereda de la clase Vehiculo y añade propiedades específicas de motocicletas.
 */
class Motocicleta extends Vehiculo {

    /** Cilindrada de la motocicleta en centímetros cúbicos (cc). */
    int cilindrada;

    /**
     * Constructor para la clase Motocicleta.
     *
     * @param marca     Marca de la motocicleta.
     * @param modelo    Modelo de la motocicleta.
     * @param color     Color de la motocicleta.
     * @param matricula Matrícula de la motocicleta.
     * @param cilindrada Cilindrada de la motocicleta en cc.
     */
    public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
        super(marca, modelo, color, matricula);
        this.cilindrada = cilindrada;
    }

    /**
     * Muestra la información de la motocicleta, incluyendo la información del vehículo base y las propiedades específicas de la motocicleta.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Requiere carnet: " + requiereCarnet());
    }

    /**
     * Determina si la motocicleta requiere carnet de conducir en función de su cilindrada.
     *
     * @return true si la cilindrada es mayor o igual a 125 cc, false en caso contrario.
     */
    public boolean requiereCarnet() {
        return cilindrada >= 125;
    }
}