package analisis.ejercicio3;

import java.util.Comparator;

/**
 * Compara cuentas bancarias por saldo (mayor primero).
 */
public class ComparaSaldo implements Comparator<CuentaBancaria> {

    /**
     * Compara dos cuentas por su saldo (mayor primero).
     *
     * @param c1 Primera cuenta.
     * @param c2 Segunda cuenta.
     * @return Negativo si c2 tiene más saldo, positivo si c1 tiene más, cero si igual.
     */
    @Override
    public int compare(CuentaBancaria c1, CuentaBancaria c2) {
        return Double.compare(c2.getSaldo(), c1.getSaldo());
    }

}