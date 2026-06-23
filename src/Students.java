public class Students extends Person {
    protected String nota;
    public Students(String name,String email,String edad,String nota){
        super(name, email, edad);
        this.nota = nota;
    }

    @Override
    public void labor() {
        System.out.println("El studiante tiene que estudiar");
    }
}
