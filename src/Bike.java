public class Bike implements  Vehicle {
    private String model;
    private String color;

    public Bike(String model,String color){
        this.model = model;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("La bicicleta modelo " + model + " de color " + color + " esta rodando");
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

}
