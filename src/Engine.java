public class Engine {
    private boolean encendido;


    public void on() {
        encendido = true;
    }

    public void off() {
        encendido = false;
    }

    public boolean estaEncendido(){
        return encendido;
    }


}
