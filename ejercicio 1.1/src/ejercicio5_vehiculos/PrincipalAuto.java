package ejercicio5_vehiculos;

import java.util.Scanner;

public class PrincipalAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Automovil a = new Automovil(
                sc.nextLine(),
                sc.nextInt(),
                sc.nextInt()
        );

        System.out.println(a.encender());
        System.out.println("Antigüedad: " + a.antiguedad());
    }
}
