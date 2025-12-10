package ejercicio3_geometria;

import java.util.Scanner;

public class PrincipalRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Etiqueta: ");
        String etiqueta = sc.nextLine();

        Rectangulo r = new Rectangulo(base, altura, etiqueta);

        System.out.println("La etiqueta es: " + r.getEtiqueta());
        System.out.println("La altura que me diste es: " + r.getAltura());
        System.out.println("La base que me diste es: " + r.getBase());

        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
    }
}
