import java.util.ArrayList;
import java.util.HashMap;

public class SystemPedidos {
    private HashMap<Integer,Pedido>pedidos = new HashMap<>();
//AGREGAR PEDIDOS

    public void agregarPedido(Pedido pedido){
pedidos.put(pedido.getIdPedidos(),pedido);
    }
    //BUSCAR PEDIDOS
public Pedido buscarPedido(int idPedido){
        return pedidos.get(idPedido);
}
    //MOSTRAR PEDIDOS
 public void mostrarPedidos(){
        for (Pedido pedido : pedidos.values()){
           pedido.mostrarPedido();
           System.out.println();
        }
 }

 //EXISTE EL PEDIDO
    public boolean existePedido(int idPedido){
        return pedidos.containsKey(idPedido);
    }

    //CANCELAR PEDIDO
    public void eliminarPedido(int idPedido){
        pedidos.remove(idPedido);
    }
}
