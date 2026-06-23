public class Admin extends Person{
    protected String password;
    public  Admin(String name,String email,String edad,String password){
        super(name, email, edad);
        this.password = password;
    }

    @Override
    public void labor() {
        System.out.println("El admin se encarga de administrar la escuela");
    }
}
