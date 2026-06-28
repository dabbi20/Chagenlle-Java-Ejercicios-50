public class Book extends Productos implements  Discountable{
    private String autor;
    private String distribucion;
    private double precioFinal;
    private double descuento;
    public Book(String id,String name,int cantidad,double precio,String autor,String distribucion){
      super(id,name,cantidad,precio);
      this.autor = autor;
      this.distribucion = distribucion;

    }

    @Override
    public void disconunt() {
this.precioFinal = getPrecio() * 0.90;
        this.descuento = getPrecio() * 0.10;
    }

    @Override
    public void products() {
        System.out.println("El producto " + getName() + " Escrito por el autor " + autor + " Cuenta con la siguiente linea de distribucion " + distribucion + " y  " +" cuesta $" + precioFinal + " y solo hay estos disponibles " + getCantidad() + " el dia de hoy esta con un descuento del " + descuento);
    }
}
