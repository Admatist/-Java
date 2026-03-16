package Lab9;

class Transport {
    String name;
    int speed;
    Transport(String name, int speed) { this.name = name; this.speed = speed; }
    void move() { System.out.println(name + " движется со скоростью " + speed + " км/ч"); }
}
class Car extends Transport {
    Car(String name, int speed) { super(name, speed); }
    @Override void move() { System.out.println("Машина " + name + " едет по дороге."); }
}
class Train extends Transport {
    Train(String name, int speed) { super(name, speed); }
    @Override void move() { System.out.println("Поезд " + name + " следует по рельсам."); }
}
class Airplane extends Transport {
    Airplane(String name, int speed) { super(name, speed); }
    @Override void move() { System.out.println("Самолет " + name + " летит в небе."); }
}
public class Task1 {
    public static void main(String[] args) {
        new Car("Tesla", 120).move();
        new Train("Sapsan", 250).move();
        new Airplane("Boeing", 850).move();
    }
}