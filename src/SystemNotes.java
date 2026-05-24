/*3.Crea un sistema de notas con ArrayList<Double>, agrega notas válidas y calcula promedio.*/

import java.util.ArrayList;
import java.util.Scanner;

public class SystemNotes {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Double> notes;
    public SystemNotes(ArrayList<Double> notes){
        this.notes = notes;
    }

    public double validadorNot() {

        double nota;

        while (true) {

            while (!scanner.hasNextDouble()) {
                System.out.println("El tipo de dato no es valido");
                scanner.next();
                System.out.println("Vuelve a intentarlo con un dato valido");
            }

            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 5) {
                return nota;
            }

            System.out.println("La nota debe estar entre 0 y 5");

        }
    }
    public void agregarNota(){
System.out.println("Agrega la nota del estudiante");
notes.add(validadorNot());

    }

    public double calcularPromedio(){
        if (notes.isEmpty()){
            System.out.println("No hay notas registradas");
            return 0;
        }


        double promedio = 0;
        for (double note : notes){
          promedio = note + promedio;
        }
        promedio = promedio / notes.size();

      return promedio;
    }

    public void mostrarNotas() {

        System.out.println(notes);

    }


}


