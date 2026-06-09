public class Register {

private UserManager userManager;
private EmailValidator emailValidator;
private PasswordValidator passwordValidator;

    public Register(UserManager userManager) {
        this.userManager = userManager;
        this.emailValidator = new EmailValidator();
        this.passwordValidator = new PasswordValidator();
    }

public boolean registrar(String name,String username,String password,String confirmPassword){
        if (!emailValidator.validarEmail(username)){
            System.out.println("Correo Invalido");
            return false;
        }

        if (!passwordValidator.validarContraseña(password)){
            System.out.println("Contraseña Invalida");
            return false;
        }
        if (!password.equals(confirmPassword)){
            System.out.println("Las contraseñas no coinciden");
            return false;
        }
        if (userManager.existeUsuario(username)){
            System.out.println("El usuario ya existe");
            return false;
        }

        User user = new User(name,username,password);
        userManager.agregarUsuario(user);

        System.out.println("Usuario registrado correctamente");
        return  true;
}
}