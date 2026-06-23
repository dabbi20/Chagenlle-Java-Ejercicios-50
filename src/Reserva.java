import java.time.LocalDate;

public class Reserva {
    //ATRIBUTOS
    private String id;
    private UserHotel userHotel;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private EstadoReservacion estadoReservacion = EstadoReservacion.PENDIENTE;
    private Habitacion habitacionAsignada = null;

    //CONSTRUCTOR
// CONSTRUCTOR CORREGIDO
    public Reserva(String id, UserHotel userHotel, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.userHotel = userHotel;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    //GETTERS

    public String getId() {
        return id;
    }

    public UserHotel getUserHotel() {
        return userHotel;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public EstadoReservacion getEstadoReservacion() {
        return estadoReservacion;
    }

    public Habitacion getHabitacionAsignada() {
        return habitacionAsignada;
    }


    //SETTERS

    public void setEstadoReservacion(EstadoReservacion estadoReservacion){
        this.estadoReservacion = estadoReservacion;
    }

    public void setHabitacionAsignada(Habitacion habitacionAsignada){
        this.habitacionAsignada = habitacionAsignada;
    }
}
