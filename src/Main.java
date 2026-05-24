import java.util.ArrayList;
import java.util.Date;

public class Main{
    public static void main(String[] args){

var User1 = new Users("Pepe","Abc12@13dff","posa123@gmail.com",23);

var Registro1 = new RegistrarUsuarios(User1);
Registro1.registrarUsuario();

        ArrayList<Double> listaNotas = new ArrayList<>();

     var sistema = new SystemNotes(listaNotas);

        sistema.agregarNota();
        sistema.agregarNota();

        sistema.mostrarNotas();

        System.out.println("Promedio: " + sistema.calcularPromedio());

        sistema.scanner.close();
    }


}
