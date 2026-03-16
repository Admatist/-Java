package Lab9;

class Device {
    String brand;
    int power;
    Device(String brand, int power) { this.brand = brand; this.power = power; }
    void turnOn() { System.out.println(brand + " включено (мощность " + power + "W)"); }
}
class Laptop extends Device {
    Laptop(String b, int p) { super(b, p); }
}
class Smartphone extends Device {
    Smartphone(String b, int p) { super(b, p); }
}
class Tablet extends Device {
    Tablet(String b, int p) { super(b, p); }
}
public class Task6 {
    public static void main(String[] args) {
        new Laptop("ASUS", 65).turnOn();
        new Smartphone("iPhone", 20).turnOn();
    }
}