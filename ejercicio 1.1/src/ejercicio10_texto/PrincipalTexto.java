package ejercicio10_texto;

import java.util.Scanner;

public class PrincipalTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Texto t = new Texto(
                sc.nextLine(),
                sc.nextLine(),
                sc.nextInt()
        );
        sc.nextLine();

        System.out.println(t.agregarPrefijo(sc.nextLine()));
        System.out.println("Espacios: " + t.contarEspacios());
    }
}
