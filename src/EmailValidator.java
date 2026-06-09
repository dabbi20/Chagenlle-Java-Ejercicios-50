public class EmailValidator {

    //METODO
    public boolean validarEmail(String email){
        if (!email.isEmpty() && email.contains("@") &&email.contains(".com") && email.length() > 10){
            return true;
        }else {

            return false ;
        }
    }
}
