public class TemperatureChecker  {
double temperature;

public TemperatureChecker(double temperature){this.temperature = temperature;}

    public void checkTemperature()throws CustomExepcion{
    if (temperature > 50 || temperature < -50){
        throw  new CustomExepcion(  "Temperatura fuera del rango permitido (-50 a 50 grados)." );
    }else {
        System.out.println("Temperatura valida");
    }
    }
}
