public class Login {
  private UserManager userManager;

  public  Login(UserManager userManager){
      this.userManager = userManager;
  }

  public boolean iniciarSession(String username,String password){
      User user = userManager.buscarUsuario(username);
      if (user == null){
          return false;
      }
      if(!user.verificarPasword(password)){
          return false;
      }
return  true;

  }
}
