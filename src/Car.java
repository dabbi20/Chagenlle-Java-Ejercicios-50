public class Car implements Vehicle{
    private String motor;
    private String marca;

    public Car(String motor, String marca){
        this.marca = marca;
        this.motor = motor;
    }

    @Override
    public void start() {
        System.out.println("El carro marca " + marca + " tiene un motor " + motor + " esta arrancnado bien");
    }

    public String getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }
}
