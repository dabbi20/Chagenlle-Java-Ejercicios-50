public abstract class Productos {
    private String id;
    private String name;
    private int cantidad;
    private double precio;

    public Productos(String id, String name, int cantidad, double precio) {
        this.id = id;
        this.name = name;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void products();
}
