import java.util.ArrayList;

public class VehicleMain {


    public  static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("V-2026","ferrari"));
        vehicles.add(new Bike("Cross","roja"));
        vehicles.add(new Truck(250.000));

        for (Vehicle vehicle : vehicles){
            vehicle.start();
        }
    }
}
