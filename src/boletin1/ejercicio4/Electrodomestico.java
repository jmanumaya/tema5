package boletin1.ejercicio4;

/**
 * Clase que representa un electrodoméstico con atributos como precio base, color, consumo energético y peso.
 */
public class Electrodomestico {

    private double precioBase = 5;

    private Colores color = Colores.valueOf("BLANCO");

    private enum Colores {BLANCO, NEGRO, ROJO, AZUL, GRIS}

    private enum Consumo {A, B, C, D, E, F}

    private Consumo consumoEnergetico = Consumo.valueOf("F");

    private int peso = 100;

    /**
     * Constructor para crear un electrodoméstico con todos los atributos especificados.
     *
     * @param precioBase        Precio base del electrodoméstico.
     * @param color             Color del electrodoméstico.
     * @param consumoEnergetico Consumo energético del electrodoméstico.
     * @param peso              Peso del electrodoméstico.
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;

        if (comprobarColor(color.toUpperCase())) {
            this.color = Colores.valueOf(color.toUpperCase());
        }

        if (comprobarConsumoEnergetico(consumoEnergetico)) {
            this.consumoEnergetico = Consumo.valueOf(String.valueOf(consumoEnergetico));
        }

        this.peso = peso;
    }

    /**
     * Constructor para crear un electrodoméstico con precio base y peso especificados.
     *
     * @param precioBase Precio base del electrodoméstico.
     * @param peso       Peso del electrodoméstico.
     */
    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    /**
     * Obtiene el precio base del electrodoméstico.
     *
     * @return El precio base del electrodoméstico.
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Establece el precio base del electrodoméstico.
     *
     * @param precioBase El nuevo precio base del electrodoméstico.
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * Obtiene el color del electrodoméstico.
     *
     * @return El color del electrodoméstico.
     */
    public Colores getColor() {
        return color;
    }

    /**
     * Establece el color del electrodoméstico.
     *
     * @param color El nuevo color del electrodoméstico.
     */
    public void setColor(String color) {
        if (comprobarColor(color.toUpperCase())) {
            this.color = Colores.valueOf(color);
        }
    }

    /**
     * Obtiene el consumo energético del electrodoméstico.
     *
     * @return El consumo energético del electrodoméstico.
     */
    public Consumo getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Establece el consumo energético del electrodoméstico.
     *
     * @param consumoEnergetico El nuevo consumo energético del electrodoméstico.
     */
    public void setConsumoEnergetico(char consumoEnergetico) {
        if (comprobarConsumoEnergetico(consumoEnergetico)) {
            this.consumoEnergetico = Consumo.valueOf(String.valueOf(consumoEnergetico));
        }
    }

    /**
     * Obtiene el peso del electrodoméstico.
     *
     * @return El peso del electrodoméstico.
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Establece el peso del electrodoméstico.
     *
     * @param peso El nuevo peso del electrodoméstico.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Comprueba si el consumo energético es válido.
     *
     * @param letra La letra del consumo energético a comprobar.
     * @return true si el consumo energético es válido, false en caso contrario.
     */
    private boolean comprobarConsumoEnergetico(char letra) {
        boolean estado;

        switch (letra) {
            case 'A', 'B', 'C', 'D', 'E', 'F' -> {
                estado = true;
            }
            default -> {
                estado = false;
            }
        }

        return estado;
    }

    /**
     * Comprueba si el color es válido.
     *
     * @param color El color a comprobar.
     * @return true si el color es válido, false en caso contrario.
     */
    private boolean comprobarColor(String color) {
        boolean estado;

        switch (color) {
            case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
                estado = true;
            }
            default -> {
                estado = false;
            }
        }

        return estado;
    }

    /**
     * Calcula el precio final del electrodoméstico basado en el consumo energético y el peso.
     *
     * @return El precio final del electrodoméstico.
     */
    public double precioFinal() {

        switch (consumoEnergetico) {

            case A -> {
                precioBase += 100;
            }

            case B -> {
                precioBase += 80;
            }

            case C -> {
                precioBase += 60;
            }

            case D -> {
                precioBase += 50;
            }

            case E -> {
                precioBase += 30;
            }

            default -> {
                precioBase += 10;
            }

        }

        if (peso > 0 && peso <= 19) {
            precioBase += 10;
        } else if (peso >= 20 && peso <= 49) {
            precioBase += 50;
        } else if (peso >= 50 && peso <= 79) {
            precioBase += 80;
        } else {
            precioBase += 100;
        }

        return precioBase;
    }
}