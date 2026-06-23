import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Hotel {
    //ATRIBUTOS
private HashMap<String,Habitacion>habitaciones;
private HashMap<String, Reserva> reservas;

    public Hotel() {
        this.habitaciones = new HashMap<>();
        this.reservas = new HashMap<>();
    }


    public void mostrarHabitacionesDisponibles(){
for (Map.Entry<String,Habitacion>habitacionEntry : habitaciones.entrySet()){
    Habitacion objeto = habitacionEntry.getValue();
if (objeto.getEstadosHabitacion() == EstadosHabitacion.DISPONIBLE){
    System.out.println("Habitación libre: " + objeto.getNumeroHabitacion());
}
}
    }

    public void registrarHabitacion(Habitacion nuevaHabitacion) {
        if (nuevaHabitacion != null) {
            habitaciones.put(nuevaHabitacion.getNumeroHabitacion(), nuevaHabitacion);
            System.out.println("Habitación " + nuevaHabitacion.getNumeroHabitacion() + " registrada en el hotel.");
        }
    }

    public void crearReserva(String idReserva, UserHotel cliente, LocalDate inicio, LocalDate fin) {
        Habitacion habitacionAsignada = null;


        for (Map.Entry<String, Habitacion> habitacionEntry : habitaciones.entrySet()) {
            Habitacion habitacionActual = habitacionEntry.getValue();
            if (habitacionActual.getEstadosHabitacion() == EstadosHabitacion.DISPONIBLE) {
                habitacionAsignada = habitacionActual;
                break;
            }
        }


        if (habitacionAsignada != null) {

            habitacionAsignada.setEstadosHabitacion(EstadosHabitacion.OCUPADA);

            Reserva nuevaReserva = new Reserva(idReserva, cliente, inicio, fin);
            nuevaReserva.setHabitacionAsignada(habitacionAsignada);
            nuevaReserva.setEstadoReservacion(EstadoReservacion.CONFIRMADA);

            reservas.put(idReserva, nuevaReserva);
            System.out.println("-> ¡Reserva " + idReserva + " CONFIRMADA! Habitación: " + habitacionAsignada.getNumeroHabitacion());

        } else {

            Reserva reservaRechazada = new Reserva(idReserva, cliente, inicio, fin);
            reservaRechazada.setEstadoReservacion(EstadoReservacion.RECHAZADA);

            reservas.put(idReserva, reservaRechazada);
            System.out.println("-> ¡Reserva " + idReserva + " RECHAZADA! No hay habitaciones disponibles en el hotel.");
        }
    }


    public void cancelarReserva(String idReserva) {
        Reserva reservaAsignada = reservas.get(idReserva);

        if (reservaAsignada == null) {
            System.out.println("Error: No se encontró ninguna reserva con el ID " + idReserva);
            return;
        }


        if (reservaAsignada.getEstadoReservacion() == EstadoReservacion.RECHAZADA) {
            System.out.println("Error: La reserva " + idReserva + " ya está RECHAZADA. No se puede cancelar.");
            return;
        }


        reservaAsignada.setEstadoReservacion(EstadoReservacion.CANCELADA);

        Habitacion habitacionALiberar = reservaAsignada.getHabitacionAsignada();
        if (habitacionALiberar != null) {
            habitacionALiberar.setEstadosHabitacion(EstadosHabitacion.DISPONIBLE);
            System.out.println("¡Reserva " + idReserva + " cancelada! La habitación " +
                    habitacionALiberar.getNumeroHabitacion() + " ahora está libre.");
        }
    }





}
