public class Carr {
    private Engine engine;
    public Carr() {
        this.engine = new Engine();
    }

   public void arrancar(){
       if (engine.estaEncendido()){
           System.out.println("El carro arranco");
       }else {
           System.out.println("No puedes arrancar el carro el motor esta apagado");
       }
   }
    public void encenderMotor() {
        engine.on();
    }

    public void apagarMotor() {
        engine.off();
    }
}
