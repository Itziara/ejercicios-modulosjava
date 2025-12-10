package ejercicio8_temperatura;

import java.util.Scanner;

public class PrincipalTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperatura t = new Temperatura(
                sc.nextDouble(),
                sc.next(),
                sc.next()
        );

        System.out.println("Extrema: " + t.esExtrema());
        t.convertir();
    }
}
