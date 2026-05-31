import java.util.HashMap;

public class Inventario {
    // Clave: El ID (String) | Valor: El objeto Producto completo
    private HashMap<String, Producto> stock;
    // Constructor para inicializar el mapa
    public Inventario(){
        this.stock =new HashMap<>();
    }
    // Método para agregar un producto al HashMap
    public void agregarProducto(Producto producto){
        // .put(clave, valor) guarda el elemento en el mapa
    stock.put(producto.getId(), producto);
    System.out.println("-> !Producto " + producto.getName() +  " guardado en el mapa!");
    }
    //Método para buscar un producto instantáneamente por su ID (UUID)
    public Producto buscarPorId(String id){
        // .get(clave) busca directamente sin necesidad de usar bucles 'for'
        return stock.get(id);
    }
    // Método para mostrar todo el mapa
    public void mostrarInventario(){
        if (stock.isEmpty()){
            System.out.println("El inventario esta vacio.");
            return;
        }
        System.out.println("\n==================== INVENTARIO (HASHMAP) ====================");
        // Recorremos los valores del mapa directamente
        for (Producto p : stock.values()){
            System.out.printf("ID: %s | Nombre: %-15s | Precio: $%-7.2f | Stock: %d\n",
                    p.getId(), p.getName(), p.getPrecio(), p.getCantidad());
        }
    }
}
