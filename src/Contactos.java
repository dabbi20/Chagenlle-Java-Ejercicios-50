import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contactos {
    private  HashMap<String,String>contacs = new HashMap<>();

  public void agregarContacots(String nombre, String telefono){
      if (contacs.containsKey(nombre)){
          System.out.println("Error el contacoto " + nombre + "Ya existe");
      }else {
          contacs.put(nombre,telefono);
          System.out.println("Contactp guardado" + nombre);
      }
  }
    // Método para mostrar todos los contactos usando entrySet
    public void mostrarContactos(){
        System.out.println("\n--- Lista de Contactos ---");
        for (Map.Entry<String,String>entrada : contacs.entrySet()){
            System.out.println("Nombre: "+ entrada.getKey() + " | Telefono: "+ entrada.getValue());
        }
    }

    static void main(String[] args) {
        var agenda = new Contactos();
        agenda.agregarContacots("Pepe","21321312321");
        agenda.agregarContacots("Juan","2312321231");
        agenda.agregarContacots("Juan","2312321231");
        agenda.agregarContacots("Juan","2312321231");
        agenda.agregarContacots("Juan","2312321231");
        agenda.agregarContacots("Beto","2312322321231");

        agenda.mostrarContactos();
    }

}
