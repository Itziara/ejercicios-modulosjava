package ejercicio2_inventario;

import java.util.Scanner;

public class PrincipalProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Referencia: ");
        String ref = sc.nextLine();

        System.out.print("Stock inicial: ");
        int stock = sc.nextInt();

        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();

        Producto p = new Producto(ref, stock, precio);

        System.out.print("Cantidad a añadir: ");
        p.agregarStock(sc.nextInt());

        System.out.println("Valor total del stock: $" + p.valorTotalStock());
    }
}
