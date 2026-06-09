public class User {
    //ATRIBUTOS
    private String name,username,password;

    //CONSTRUCTOR
    public User(String name,String username,String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }
    //GETTERS
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    //SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setUsername(String username){
        this.username = username;
    }
    //METODOS
    public boolean verificarPasword(String passwordIngresada){
        return password.equals(passwordIngresada);


    }
}
