public class Electronic extends  Productos implements Discountable{
    private String marca;
    private  String model;
    private double precioFinal;
    private double descuento;

public Electronic(String id,String name,int cantidad, double precio,String marca,String model){
    super(id,name,cantidad,precio);
    this.marca = marca;
    this.model = model;

}

    @Override
    public void disconunt() {
        this.precioFinal = getPrecio() * 0.80;
        this.descuento = getPrecio() * 0.20;
    }

    @Override
    public void products() {
        System.out.println(getName() + " es de la marca " + marca + " y su modelo es " + model + " su precio es de " + getPrecio() + " y solo hay estas unidades" + getCantidad() + " pero el dia de hoy hay un descuento del " + descuento + " por lo tanto su precio queda en " + precioFinal);
    }
}
