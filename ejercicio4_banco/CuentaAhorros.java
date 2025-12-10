package ejercicio4_cuenta;

public class CuentaAhorros {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaAhorros(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
