package Lab9;

class Product {
    String name;
    double price;
    Product(String n, double p) { this.name = n; this.price = p; }
    void showPrice() { System.out.println(name + " стоит " + price + " тенге."); }
}
class Food extends Product {
    Food(String n, double p) { super(n, p); }
}
class Electronics extends Product {
    Electronics(String n, double p) { super(n, p); }
}
class Clothes extends Product {
    Clothes(String n, double p) { super(n, p); }
}
public class Task10 {
    public static void main(String[] args) {
        new Food("Хлеб", 150).showPrice();
        new Electronics("Наушники", 5000).showPrice();
    }
}