import java.util.ArrayList;

public class Student {


    private String nombre;
    private int edad;
    private ArrayList<Double> notas;
    private String estado;

    public Student(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new ArrayList<>();
        actualizarEstado();
    }

    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public String getEstado() {
        return estado;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // MÉTODOS

    public void agregarNota(double nota) {

        if (nota >= 0 && nota <= 5) {
            notas.add(nota);
            actualizarEstado();
        } else {
            System.out.println("La nota debe estar entre 0 y 5");
        }
    }

    public double calcularPromedio() {

        if (notas.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();
    }

    public void actualizarEstado() {

        if (calcularPromedio() >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    public void mostrarNotas(){
        System.out.println(notas);
    }

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Notas: " + notas);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + estado);
    }
}