import java.util.HashSet;
import java.util.Set;

// Definición del Enum
enum Roles {
    ADMIN, CLIENTE, TECNICO
}

public class SistemaRoles {
    private Set<Roles> rolUser = new HashSet<>();


    public boolean asignarRol(Roles nuevoRol) {
        return rolUser.add(nuevoRol);

    }


    public boolean removerRol(Roles rolARemover) {
        return rolUser.remove(rolARemover);
    }


    public boolean tieneRol(Roles rolAChecar) {
        return rolUser.contains(rolAChecar);
    }


    public void mostrarRoles() {
        if (rolUser.isEmpty()) {
            System.out.println("El usuario no tiene roles asignados.");
        } else {
            System.out.println("Roles del usuario: " + rolUser);
        }
    }


    public static void main(String[] args) {
        SistemaRoles usuario = new SistemaRoles();

        // Agregando roles
        usuario.asignarRol(Roles.CLIENTE);
        usuario.asignarRol(Roles.TECNICO);

        // Intentando agregar un duplicado (el HashSet lo ignorará)
        boolean seAgregoDuplicado = usuario.asignarRol(Roles.CLIENTE);
        System.out.println("¿Se pudo duplicar el rol CLIENTE?: " + seAgregoDuplicado);


        usuario.mostrarRoles();

        // Verificar permisos
        System.out.println("¿Es ADMIN?: " + usuario.tieneRol(Roles.ADMIN));
        System.out.println("¿Es TECNICO?: " + usuario.tieneRol(Roles.TECNICO));
    }
}
