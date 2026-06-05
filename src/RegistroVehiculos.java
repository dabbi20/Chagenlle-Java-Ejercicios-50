public class RegistroVehiculos {
    private  String marca;
    private String nombre;
    private  int modelo;
    private String color;
    private String motor;
    private String placa;

    public RegistroVehiculos(String marca, String nombre, int modelo, String color, String motor, String placa) {
        this.marca = marca;
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.placa = placa;


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarInformacion() {
        System.out.println("===== INFORMACIÓN DEL VEHÍCULO =====");
        System.out.println("Marca: " + marca);
        System.out.println("Nombre: " + nombre);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Motor: " + motor);
        System.out.println("Placa: " + placa);
    }

    public void encender() {
        System.out.println(nombre + " ha sido encendido.");
    }

    public void apagar() {
        System.out.println(nombre + " ha sido apagado.");
    }

    public void acelerar() {
        System.out.println(nombre + " está acelerando.");
    }

    public void frenar() {
        System.out.println(nombre + " está frenando.");
    }

    static void main(String[] args) {
        RegistroVehiculos vehiculo1 = new RegistroVehiculos(
                "Toyota",
                "Corolla",
                2024,
                "Blanco",
                "1.8L",
                "ABC-123"
        );


        vehiculo1.mostrarInformacion();

        System.out.println();


        vehiculo1.encender();
        vehiculo1.acelerar();
        vehiculo1.frenar();
        vehiculo1.apagar();
    }
    }

