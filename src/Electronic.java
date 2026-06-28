public class Electronic extends  Productos {
    private String marca;
    private  String model;

public Electronic(String id,String name,int cantidad, double precio,String marca,String model){
    super(id,name,cantidad,precio);
    this.marca = marca;
    this.model = model;
}
    @Override
    public void products() {
        System.out.println(getName() + " es de la marca " + marca + " y su modelo es " + model + " su precio es de " + getPrecio() + " y solo hay estas unidades" + getCantidad());
    }
}
