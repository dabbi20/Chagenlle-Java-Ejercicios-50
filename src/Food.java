public class Food extends  Productos{
    private String direccion;
    private String plato;
public  Food(String id,String name,int cantidad,double precio,String direccion,String plato){
    super(id, name, cantidad, precio);
    this.direccion = direccion;
    this.plato = plato;
}

    @Override
    public void products() {
        System.out.println("El restaurante " + getName() + " su plato de especialidad es " + plato + " su precio es de $ " + getPrecio() + " solo hacen al dia " + getCantidad() + " y se ubica en " + direccion);
    }
}
