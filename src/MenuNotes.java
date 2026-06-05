import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MenuNotes {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<Double>listaNotas = new ArrayList<>();

        SystemNotes sistema = new SystemNotes(listaNotas);
        int opcion;

        do {
            System.out.println("\n--- MENU DE NOTAS ---");
            System.out.println("1. Agregar nota");
            System.out.println("2. Calcular promedio");
            System.out.println("3. Mostrar todas las notas");
            System.out.println("4. Salir");
            while (!scanner.hasNextInt()){
                System.out.println("Por favor introduce una opcion valida.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    sistema.agregarNota();
                    break;
                case 2:
                    System.out.println(sistema.calcularPromedio());
                    break;
                case 3:
                    sistema.mostrarNotas();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("La opcion no es valida intenta de nuevo");
            }

        }while (opcion != 4);
scanner.close();

    }


}
