package Lab13;
import java.util.*;
class Order {
    int id; double price;
    Order(int id, double p) { this.id = id; this.price = p; }
    @Override public String toString() { return "Order " + id + " [" + price + "]"; }
}
public class Task20 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(new Order(1, 500), new Order(2, 1500), new Order(3, 1200));
        orders.stream().filter(o -> o.price > 1000).sorted(Comparator.comparing(o -> o.price)).forEach(System.out::println);
    }
}