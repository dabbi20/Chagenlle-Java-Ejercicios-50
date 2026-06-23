public class Teacher extends Person{
    protected String clase;
    public Teacher(String name,String email,String edad,String clase){
        super(name, email, edad);
        this.clase = clase;
    }

    @Override
    public void labor() {
        System.out.println("El profesor enseña");
    }
}
