/*1.Crea un sistema de registro de usuario con nombre, edad, email y contraseña. Valida edad, longitud de contraseña y email con contains. */

public class Users {
private String name;
private String password;
private String email;
private int age;

public Users(String name, String password, String email, int age){
    this.name = name;
    this.password = password;
    this.email = email;
    this.age = age;
}

public boolean EdadRequerida(){
    if (age >= 18){
        return true;
    }else {
       return false;
    }
}

    public boolean ValidadorEmail(){

        return email != null
                &&
                email.contains("@")
                &&
                email.contains(".");

    }

public boolean ParametrosContraseña(){
    boolean TieneNumero = false;
    boolean TieneCaracteres = false;
    boolean LongitudValid = false;
    String Caracteres = "!@#$%^&*";

    if(password == null){
        return false;
    }

    if (password.length() > 9){
        LongitudValid = true;
    }else {
        LongitudValid = false;
    }

    for (char letra : password.toCharArray()){

        if (letra >= '0' && letra <= '9'){
            TieneNumero = true;
        }

        if (Caracteres.contains(String.valueOf(letra))){
            TieneCaracteres = true;
        }





    }

    if (TieneCaracteres && TieneNumero && LongitudValid){
       return true;
    }else {
        return false;
    }

}

//GETTERS

    public int getAge() {
        return age;
    }
    public String getPassword(){
    return password;
    }
    public String getName(){
    return name;
    }
    public String getEmail(){
    return email;
    }

}
