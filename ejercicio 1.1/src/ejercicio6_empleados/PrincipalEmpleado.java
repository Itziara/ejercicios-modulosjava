package ejercicio6_empleados;

import java.util.Scanner;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado e = new Empleado(
                sc.nextLine(),
                sc.nextDouble(),
                sc.nextDouble()
        );

        System.out.print("Aumento %: ");
        e.aumentar(sc.nextDouble());

        System.out.println("Salario neto: $" + e.salarioNeto());
    }
}
