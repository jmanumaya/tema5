package analisis.ejercicio1;

/**
 * Clase que representa un camión, un tipo de vehículo.
 * Hereda de la clase Vehiculo y añade propiedades específicas de camiones.
 */
class Camion extends Vehiculo {

    /** Peso máximo autorizado del camión en kilogramos (kg). */
    double pesoMaximoAutorizado;

    /** Indica si el camión transporta mercancía peligrosa. */
    boolean mercanciaPeligrosa;

    /**
     * Constructor para la clase Camion.
     *
     * @param marca                 Marca del camión.
     * @param modelo                Modelo del camión.
     * @param color                 Color del camión.
     * @param matricula             Matrícula del camión.
     * @param pesoMaximoAutorizado Peso máximo autorizado del camión en kg.
     * @param mercanciaPeligrosa   Indica si el camión transporta mercancía peligrosa.
     */
    public Camion(String marca, String modelo, String color, String matricula, double pesoMaximoAutorizado, boolean mercanciaPeligrosa) {
        super(marca, modelo, color, matricula);
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    /**
     * Muestra la información del camión, incluyendo la información del vehículo base y las propiedades específicas del camión.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Peso máximo autorizado: " + pesoMaximoAutorizado + " kg");
        System.out.println("Mercancía peligrosa: " + mercanciaPeligrosa);
    }
}