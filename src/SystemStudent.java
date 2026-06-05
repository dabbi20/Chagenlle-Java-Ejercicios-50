import java.util.ArrayList;


public class SystemStudent {
    private ArrayList<Student> estudiantes;
    public SystemStudent() {
        estudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Student estudiante) {

        for (Student e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(estudiante.getNombre())) {
                System.out.println("El estudiante ya existe.");
                return;
            }
        }

        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado correctamente.");
    }

    public void listarAprobados() {

        for (Student estudiante : estudiantes) {

            if (estudiante.getEstado().equals("Aprobado")) {
                estudiante.mostrarInformacion();
            }
        }
    }
    public void listarReprobados() {

        for (Student estudiante : estudiantes) {

            if (estudiante.getEstado().equals("Reprobado")) {
                estudiante.mostrarInformacion();
            }
        }
    }

    public Student buscarEstudiante(String nombre) {

        for (Student estudiante : estudiantes) {

            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }

        return null;
    }

    public void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (Student estudiante : estudiantes) {
            estudiante.mostrarInformacion();
            System.out.println("----------------------");
        }
    }

    public double calcularPromedioGeneralDelGrupo() {

        if (estudiantes.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Student estudiante : estudiantes) {
            suma += estudiante.calcularPromedio();
        }

        return suma / estudiantes.size();
    }

}
