import java.util.Locale;
import java.util.Scanner;

public class Job {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("--- CREACION DE TRABAJADOR ---");
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();

        if (nombre.trim().isEmpty()) {
            System.out.println("Error: el nombre no puede estar en blanco.");
            return; // DETIENE EL PROGRAMA INMEDIATAMENTE
        }
        System.out.println("Trabajador registrado: " + nombre);


        System.out.println("Ingresa tu salario");
        double salario = sc.nextDouble();

        if (salario <= 0) {
            System.out.println("Error: Tu salario no puede ser de 0 o menor a 0. Proceso cancelado.");
            return;
        }
        System.out.println("Tu salario es: " + salario);


        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();

        if (edad < 18 || edad > 80) {
            System.out.println("Lo siento, no cumples con el rango de edad requerido (18-80 años).");
            return;
        }
        System.out.println("Tu edad es aprobada, tienes: " + edad);


        System.out.println("\n--- REGISTRO COMPLETADO EXITOSAMENTE ---");
        System.out.println("Nombre: " + nombre + " | Salario: $" + salario + " | Edad: " + edad);

        sc.close();
    }
}
