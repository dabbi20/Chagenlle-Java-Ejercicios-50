import java.util.UUID;

public class Producto implements Reportable{
    private String id;
    private String name;
    private double precio;
    private int cantidad;

    public Producto() {
        this.id = UUID.randomUUID().toString();
    }

    public Producto(String name, double precio, int cantidad) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public void compilarDatos() {
        System.out.println("Verificando existencias en almacén para: " + name);
        if (cantidad == 0){
            System.out.println("[ALERTA]: El producto '" + name + "' no tiene stock disponible.");
        }else if (cantidad < 5) {
            System.out.println("[ADVERTENCIA]: Stock bajo para '" + name + "'. Quedan pocas unidades.");
        }
    }

    @Override
    public void exportar(String formato) {
        double valorTotalInventario = precio * cantidad;
        System.out.println("=== REPORTE DE PRODUCTO (" + formato + ") ===");
        System.out.println("ID Único: " + id);
        System.out.println("Producto: " + name);
        System.out.println("Precio Unitario: $" + precio);
        System.out.println("Cantidad en Stock: " + cantidad + " unidades");
        System.out.println("Valor Total en Inventario: $" + String.format("%.2f", valorTotalInventario));
        System.out.println("=========================================\n");
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}
