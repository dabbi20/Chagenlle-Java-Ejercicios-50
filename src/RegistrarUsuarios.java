public class RegistrarUsuarios {
    Users user;

    public RegistrarUsuarios(Users user){
        this.user = user;
    }

    public void registrarUsuario(){



        if(
                user.EdadRequerida()
                        &&
                        user.ValidadorEmail()
                        &&
                        user.ParametrosContraseña()
        ){

            System.out.println("Usuario registrado");

        }else{

            System.out.println("Registro rechazado");

        }

    }

}