package ejercicio7_tareas;

import java.util.Scanner;

public class PrincipalTarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tarea t = new Tarea(sc.nextLine(), sc.nextLine());

        System.out.println("¿Urgente?: " + t.esUrgente());
        t.completar();
    }
}
