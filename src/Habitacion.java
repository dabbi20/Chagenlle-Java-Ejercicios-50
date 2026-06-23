public class Habitacion {
    //ATRIBUTOS
    private String numeroHabitacion;
    private EstadosHabitacion estadosHabitacion;
    //CONSTRUCTOR
    public Habitacion(String numeroHabitacion,EstadosHabitacion estadosHabitacion){
        this.estadosHabitacion = estadosHabitacion;
        this.numeroHabitacion = numeroHabitacion;
    }
    //GETTERS
    public String getNumeroHabitacion(){
        return numeroHabitacion;
    }
    public EstadosHabitacion getEstadosHabitacion(){
        return estadosHabitacion;
    }

//SETTERS
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setEstadosHabitacion(EstadosHabitacion estadosHabitacion) {
        this.estadosHabitacion = estadosHabitacion;
    }
}
