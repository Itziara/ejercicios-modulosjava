package ejercicio1_libros;

import java.util.Scanner;

public class PrincipalLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID del libro: ");
        String id = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Año de publicación: ");
        int anio = sc.nextInt();

        Libro libro = new Libro(id, autor, anio);

        System.out.println("Disponible: " + libro.isDisponible());
        libro.reservarLibro();
        System.out.println("¿Apto para préstamo?: " + libro.esAptoPrestamo());
    }
}
