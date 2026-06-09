import java.util.HashMap;

public class UserManager {

    private HashMap<String,User>usuarios = new HashMap<>();

 public void agregarUsuario(User user){
     usuarios.put(user.getUsername(),user);
 }
 public boolean existeUsuario(String username){
     return usuarios.containsKey(username);
 }
public User buscarUsuario(String username){
     return usuarios.get(username);
}
}
