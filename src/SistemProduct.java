
import java.util.HashMap;

public class SistemProduct {

private  HashMap<Integer,Product>sistemProduct = new HashMap<>();


    public void agregarProduct(Product product){
        sistemProduct.put(product.getId(), product);
    }



public Product buscarProduct(int id){
    return sistemProduct.get(id);
}
    public double calculateInventary(Product product){
        return product.getPrecio() * product.getCantidad();
    }

    public void mostrarInformacion(Product product){
        System.out.println("*******************************");
        System.out.println("Nombre: " + product.getName());
        System.out.println("Precio: $" + product.getPrecio());
        System.out.println("Cantidad: "+ product.getCantidad());
        System.out.println("*******************************");
    }


}