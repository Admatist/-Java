package Lab9;

class Vehicle {
    void startEngine() { System.out.println("Двигатель запущен."); }
}
class Bike extends Vehicle {
    @Override void startEngine() { System.out.println("Двигатель мотоцикла ревет."); }
}
class Bus extends Vehicle {
    @Override void startEngine() { System.out.println("Двигатель автобуса гудит."); }
}
class Taxi extends Vehicle {
    @Override void startEngine() { System.out.println("Двигатель такси работает тихо."); }
}
public class Task8 {
    public static void main(String[] args) {
        new Bike().startEngine();
        new Bus().startEngine();
    }
}