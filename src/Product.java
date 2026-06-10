public class Product {
    //ATRIBUTOS

    private String name;
    private int cantidad;
    private double precio;
    private int id;
//CONSTRUCTOR
    public Product(String name, int cantidad, double precio,int id){

        this.name = name;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id = id;
    }



    //GETTERS

public int getId(){
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

    //SETTERS

    public void setName(String name){
        this.name = name;
    }
    public void  setCantidad(int cantidad){
        if (cantidad >= 0){
            this.cantidad = cantidad;
        }
    }
    public void setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
        }
    }



}
