import java.util.HashMap;

public class AgendaDeContactos {
    public HashMap<String, Contacto>gestion = new HashMap<>();


    public void agregarContacto(Contacto contacto){
        gestion.put(contacto.getName(), contacto);
    }

    public Contacto buscarContacto(String nombre){
return gestion.get(nombre);
    }


    public void eliminarContacto(String nombre){
        gestion.remove(nombre);
    }

    public void actualizarContacto(String nombreActual,
                                   String nuevoNombre,
                                   String nuevoCelular){

        if(gestion.containsKey(nombreActual)){

            Contacto contacto = gestion.get(nombreActual);

            gestion.remove(nombreActual);

            contacto.setName(nuevoNombre);
            contacto.setCell(nuevoCelular);

            gestion.put(nuevoNombre, contacto);
        }
    }
}
