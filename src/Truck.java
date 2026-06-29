public class Truck implements Vehicle{
    private double peso;

    public Truck(double peso){
        this.peso = peso;
    }

    @Override
    public void start() {
        System.out.println("El tractor puede cargar un peso de " + peso + " y arranca a la perfeccion");
    }
}
