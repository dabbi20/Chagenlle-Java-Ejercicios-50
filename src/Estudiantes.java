public class Estudiantes {

    //ATRIBUTOS
    private String codigo;
    private String nombre;
    private double promedio;
//CONSTRUCTOR
    public Estudiantes(String codigo, String nombre, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
    }
//GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }
//SETTERS
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 5){
            this.promedio = promedio;
        }
    }


    //METODOS
public boolean aprobar(){
        return promedio >= 3.0;
}

    public void mostrarInformacion(){
        System.out.println("Codigo :" + codigo);
        System.out.println("Nombre :" + nombre);
        System.out.println("Promedio :" + promedio);
        System.out.println("El estudiante aprobo?" + aprobar());
    }

    static void main(String[] args) {
        var estudiante1 = new Estudiantes("123456","Luis Molero", 4.8);
        var estudiante2 = new Estudiantes("789123","David Carrasco", 4.6);
        var estudiante3 = new Estudiantes("321654","Laura Franco", 4.7);

        estudiante1.mostrarInformacion();
        estudiante2.setPromedio(5.00);
        estudiante2.setCodigo("10101");
    System.out.println(    estudiante2.getPromedio());
      System.out.println(  estudiante2.getCodigo());
      System.out.println("El estudiante " + estudiante2.getNombre() + " con promedio " + estudiante2.getPromedio() +" y codigo " + estudiante2.getCodigo() + " Paso ? " + estudiante2.aprobar());
    }
    }


