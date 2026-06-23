import java.time.LocalDate;

public class HotelMain {
    public static void main(String[] args) {

        LocalDate checkIn = LocalDate.of(2026, 7, 10);
        LocalDate checkOut = LocalDate.of(2026, 7, 15);
    var usuario1 = new UserHotel("1","David","davidack@gmail.com");
        var usuario2 = new UserHotel("2","Manuel","davidack12@gmail.com");
        var usuario3 = new UserHotel("3","Posa","Posa123@gmail.com");
    var habitacion = new Habitacion("101", EstadosHabitacion.DISPONIBLE);
        var habitacion1 = new Habitacion("102", EstadosHabitacion.DISPONIBLE);
        var habitacion2 = new Habitacion("103", EstadosHabitacion.DISPONIBLE);
        var habitacion3 = new Habitacion("104", EstadosHabitacion.DISPONIBLE);
    var reserva1 = new Reserva("001",usuario1,checkIn,checkOut);
        var reserva2 = new Reserva("002",usuario2,checkIn,checkOut);
        var reserva3 = new Reserva("003",usuario1,checkIn,checkOut);
    var hotel1 = new Hotel();
    hotel1.registrarHabitacion(habitacion);
        hotel1.registrarHabitacion(habitacion1);
        hotel1.registrarHabitacion(habitacion2);
        hotel1.registrarHabitacion(habitacion3);
        hotel1.mostrarHabitacionesDisponibles();
   hotel1.crearReserva("001",usuario2,checkIn,checkOut);
        hotel1.crearReserva("002",usuario1,checkIn,checkOut);
        hotel1.crearReserva("003",usuario3,checkIn,checkOut);
        hotel1.cancelarReserva("001");
    }
}
