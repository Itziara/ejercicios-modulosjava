package ejercicio9_vuelos;

import java.util.Scanner;

public class PrincipalVuelo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vuelo v = new Vuelo(sc.nextLine(), sc.nextInt());

        System.out.print("Reservas a realizar: ");
        int r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            v.reservar();
        }

        System.out.println("Ocupación: " + v.ocupacion() + "%");
    }
}
