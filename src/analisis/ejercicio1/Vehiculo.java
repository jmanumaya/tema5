package analisis.ejercicio1;

/**
 * Clase abstracta que representa un vehículo genérico.
 * Contiene propiedades y métodos comunes a todos los vehículos.
 */
abstract class Vehiculo {
    /** Marca del vehículo. */
    String marca;
    /** Modelo del vehículo. */
    String modelo;
    /** Color del vehículo. */
    String color;
    /** Matrícula del vehículo. */
    String matricula;
    /** Indica si el motor está encendido. */
    boolean motorEncendido;
    /** Marcha actual del vehículo. */
    int marchaActual;
    /** Velocidad actual del vehículo en km/h. */
    int velocidadActual;

    /**
     * Constructor para la clase Vehiculo.
     *
     * @param marca     Marca del vehículo.
     * @param modelo    Modelo del vehículo.
     * @param color     Color del vehículo.
     * @param matricula Matrícula del vehículo.
     */
    public Vehiculo(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.motorEncendido = false;
        this.marchaActual = 0;
        this.velocidadActual = 0;
    }

    /**
     * Enciende el motor del vehículo.
     */
    public void arrancar() {
        if (!motorEncendido) {
            motorEncendido = true;
            System.out.println("El motor se ha encendido.");
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }

    /**
     * Apaga el motor del vehículo.
     */
    public void parar() {
        if (motorEncendido) {
            motorEncendido = false;
            System.out.println("El motor se ha apagado.");
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }

    /**
     * Sube una marcha en el vehículo.
     */
    public void subirMarcha() {
        if (motorEncendido) {
            if (marchaActual < 5) {
                marchaActual++;
                System.out.println("Marcha actual: " + marchaActual);
            } else {
                System.out.println("Ya estás en la marcha máxima.");
            }
        } else {
            System.out.println("El motor debe estar encendido para cambiar de marcha.");
        }
    }

    /**
     * Baja una marcha en el vehículo.
     */
    public void bajarMarcha() {
        if (motorEncendido) {
            if (marchaActual > 0) {
                marchaActual--;
                System.out.println("Marcha actual: " + marchaActual);
            } else {
                System.out.println("Ya estás en punto muerto.");
            }
        } else {
            System.out.println("El motor debe estar encendido para cambiar de marcha.");
        }
    }

    /**
     * Acelera el vehículo hasta la velocidad especificada.
     *
     * @param velocidad Velocidad deseada en km/h.
     */
    public void acelerar(int velocidad) {
        if (motorEncendido) {
            velocidadActual = velocidad;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
            actualizarMarcha();
        } else {
            System.out.println("El motor debe estar encendido para acelerar.");
        }
    }

    /**
     * Desacelera el vehículo hasta la velocidad especificada.
     *
     * @param velocidad Velocidad deseada en km/h.
     */
    public void desacelerar(int velocidad) {
        if (motorEncendido) {
            velocidadActual = velocidad;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
            actualizarMarcha();
        } else {
            System.out.println("El motor debe estar encendido para desacelerar.");
        }
    }

    /**
     * Actualiza la marcha actual en función de la velocidad.
     */
    private void actualizarMarcha() {
        if (velocidadActual >= 0 && velocidadActual < 30) {
            marchaActual = 1;
        } else if (velocidadActual >= 30 && velocidadActual < 50) {
            marchaActual = 2;
        } else if (velocidadActual >= 50 && velocidadActual < 70) {
            marchaActual = 3;
        } else if (velocidadActual >= 70 && velocidadActual < 100) {
            marchaActual = 4;
        } else if (velocidadActual >= 100) {
            marchaActual = 5;
        }
        System.out.println("Marcha actual: " + marchaActual);
    }

    /**
     * Muestra la información del vehículo.
     */
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Motor encendido: " + motorEncendido);
        System.out.println("Marcha actual: " + marchaActual);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
}