import java.util.UUID;

public class Producto {
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
