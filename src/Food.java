public class Food extends  Productos implements Discountable{
    private String direccion;
    private String plato;
    private double precioFinal;
    private double descuento;
public  Food(String id,String name,int cantidad,double precio,String direccion,String plato){
    super(id, name, cantidad, precio);
    this.direccion = direccion;
    this.plato = plato;
}

    @Override
    public void disconunt() {
        this.precioFinal = getPrecio() * 0.70;
        this.descuento = getPrecio() * 0.30;
    }

    @Override
    public void products() {
        System.out.println("El restaurante " + getName() + " su plato de especialidad es " + plato + " su precio es de $ " + getPrecio() + " solo hacen al dia " + getCantidad() + " y se ubica en " + direccion + " los dias miercoles se aplican descuentos del %" + descuento + " por lo tanto su precio queda en $ " + precioFinal );
    }
}
