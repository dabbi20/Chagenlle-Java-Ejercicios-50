import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void agregarItem(String producto, int cantidad) {
        items.add(new OrderItem(producto, cantidad));
    }
}