package ejercicio4_cuenta;

import java.util.Scanner;

public class PrincipalCuenta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitud de datos al usuario
        System.out.print("Numero de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Titular de la cuenta: ");
        String titular = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        // Crear objeto Cuenta
        CuentaAhorros cuenta = new CuentaAhorros(numeroCuenta, titular, saldoInicial);

        // Depósito
        System.out.print("Cantidad a depositar: ");
        double deposito = sc.nextDouble();
        cuenta.depositar(deposito);

        // Retiro
        System.out.print("Cantidad a retirar: ");
        double retiro = sc.nextDouble();
        cuenta.retirar(retiro);

        // Mostrar saldo final
        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}

