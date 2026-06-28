public class Book extends Productos{
    private String autor;
    private String distribucion;
    public Book(String id,String name,int cantidad,double precio,String autor,String distribucion){
      super(id,name,cantidad,precio);
      this.autor = autor;
      this.distribucion = distribucion;
    }


    @Override
    public void products() {
        System.out.println("El producto " + getName() + " Escrito por el autor " + autor + " Cuenta con la siguiente linea de distribucion " + distribucion + " y  " +" cuesta $" + getPrecio() + " y solo hay estos disponibles " + getCantidad() );
    }
}
