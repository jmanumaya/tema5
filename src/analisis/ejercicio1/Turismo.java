package analisis.ejercicio1;

/**
 * Clase que representa un turismo, un tipo de vehículo.
 * Hereda de la clase Vehiculo y añade propiedades específicas de turismos.
 */
class Turismo extends Vehiculo {

    /** Número de plazas del turismo. */
    int numeroPlazas;

    /** Tipo de uso del turismo (profesional o particular). */
    String tipoUso;

    /**
     * Constructor para la clase Turismo.
     *
     * @param marca        Marca del turismo.
     * @param modelo       Modelo del turismo.
     * @param color        Color del turismo.
     * @param matricula    Matrícula del turismo.
     * @param numeroPlazas Número de plazas del turismo.
     * @param tipoUso      Tipo de uso del turismo (profesional o particular).
     */
    public Turismo(String marca, String modelo, String color, String matricula, int numeroPlazas, String tipoUso) {
        super(marca, modelo, color, matricula);
        this.numeroPlazas = numeroPlazas;
        this.tipoUso = tipoUso;
    }

    /**
     * Muestra la información del turismo, incluyendo la información del vehículo base y las propiedades específicas del turismo.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de plazas: " + numeroPlazas);
        System.out.println("Tipo de uso: " + tipoUso);
    }
}