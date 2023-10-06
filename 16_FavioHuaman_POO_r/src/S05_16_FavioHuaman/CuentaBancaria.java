package S05_16_FavioHuaman;

/**
 *
 * @author Carlos
 */
public class CuentaBancaria {
        private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado con éxito. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad de depósito debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado con éxito. Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad no válida para retirar.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
