public class Products {
private String codigo;
private String nombre;
private double precio;
private int cantidad;

//CONSTRUCTOR
    public Products(String codigo, double precio, String nombre, int cantidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    //SETTERS
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0){
            this.precio = cantidad;
        }
    }

//METODOS
 public double calcularValorInventario(){

        return precio * cantidad;

 }

public void mostrarInformacion(){
System.out.println("*******************************");
System.out.println("Codigo: " + codigo);
System.out.println("Nombre: " + nombre);
System.out.println("Precio: $" + precio);
System.out.println("Cantidad: "+ cantidad);
System.out.println("Valor inventario: $"+ calcularValorInventario());
System.out.println("*******************************");
}



    static void main(String[] args) {

        //DATA QUEMADA
var producto1 = new Products("P001",40.000,"Teclado Mecanico",10);
var producto2 = new Products("P002",80.000,"Mouse Gamer",20);
var producto3 = new Products("P003",450.000,"Monito LCD 4K",8);

producto1.mostrarInformacion();
producto2.mostrarInformacion();
producto3.mostrarInformacion();
producto1.calcularValorInventario();
producto2.calcularValorInventario();
producto3.calcularValorInventario();

//USE DEL GETTER

System.out.println("Consulta individual");
        System.out.println("Nombre del producto 3: " + producto3.getNombre());

//USE DEL SETTER
        producto1.setNombre("Teclado Mecanico Gamer");
        producto1.setPrecio(120.000);

        System.out.println("Informacion actualizada del producto 1");
        System.out.println("Nombre" + producto1.getNombre());
        System.out.println("Precio $" + producto1.getPrecio());
    }
}
