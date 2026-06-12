import java.util.ArrayList;

public class CarritoCompras {
    //ATRIBUTOS
    private ArrayList<ItemCarrito> carrito = new ArrayList<>();

    public ArrayList<ItemCarrito> getItems() {
        return carrito;
    }

//METODOS

    //AÑADIR CARRITO
    public void añadirCarrito(Product product, int cantidad){

        if(product.getCantidad() < cantidad){
            System.out.println("Stock insuficiente");
            return;
        }

        for(ItemCarrito item : carrito){

            if(item.getProduct().getId() == product.getId()){

                item.setCantidad(
                        item.getCantidad() + cantidad
                );

                product.setCantidad(
                        product.getCantidad() - cantidad
                );

                return;
            }
        }

        carrito.add(
                new ItemCarrito(product, cantidad)
        );

        product.setCantidad(
                product.getCantidad() - cantidad
        );
    }

     //CALCULAR EL SUBTOTAL
public double calcularSubtotal(){
        double subtotal = 0;
    for (ItemCarrito item : carrito){
        subtotal += item.getProduct().getPrecio() * item.getCantidad();
    }
    return  subtotal;
    }
    //CALCULAR DESCUENTOS
    public double calcularDescuento(){
        double subtotal = calcularSubtotal();
        return  subtotal * 0.10;
    }

    //IMPUESTOS
    public  double calcularImpuestos(){
        double subtotal = calcularSubtotal();
        double descuento = calcularDescuento();
        return (subtotal - descuento)* 0.19;
    }
    //TOTAL
    public double calcularTotal(){

        double subtotal = calcularSubtotal();
        double descuento = calcularDescuento();
        double impuestos = calcularImpuestos();

        return subtotal - descuento + impuestos;
    }

    public void mostrarFactura(){

        System.out.println("\n========== FACTURA ==========");

        for(ItemCarrito item : carrito){

            Product p = item.getProduct();

            double totalProducto =
                    p.getPrecio() * item.getCantidad();

            System.out.println(
                    p.getName()
                            + " | Cantidad: "
                            + item.getCantidad()
                            + " | Precio: $"
                            + p.getPrecio()
                            + " | Total: $"
                            + totalProducto
            );
        }

        System.out.println("----------------------------");

        System.out.println(
                "Subtotal: $" +
                        calcularSubtotal()
        );

        System.out.println(
                "Descuento: -$" +
                        calcularDescuento()
        );

        System.out.println(
                "IVA: +$" +
                        calcularImpuestos()
        );

        System.out.println(
                "TOTAL: $" +
                        calcularTotal()
        );

        System.out.println("============================");
    }


}
