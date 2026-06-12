import java.util.ArrayList;

public class Pedido {
    private int idPedidos;
    private ArrayList<ItemCarrito> items;
    private double subtotal;
    private double descuento;
    private double impuestos;
    private  double total;
    private String estado;


    public  Pedido(int idPedidos, CarritoCompras carrito){
        this.idPedidos = idPedidos;

        this.items = new ArrayList<>(
                carrito.getItems()
        );

        this.subtotal = carrito.calcularSubtotal();
        this.descuento = carrito.calcularDescuento();
        this.impuestos = carrito.calcularImpuestos();
        this.total = carrito.calcularTotal();
        this.estado = "Pendiente";
    }

    public int getIdPedidos() {
        return idPedidos;
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarPedido(){
        System.out.println("===== PEDIDO #" + idPedidos + " =====" );
        for (ItemCarrito item : items){
            System.out.println(item.getProduct().getName() +" x "+ item.getCantidad() );
        }
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA: $" + impuestos);
        System.out.println("Total: $" + total);
    }
}
