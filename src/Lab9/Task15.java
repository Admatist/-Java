package Lab9;

class Appliance {
    void operate() { System.out.println("Прибор запущен."); }
}
class Refrigerator extends Appliance {
    @Override void operate() { System.out.println("Холодильник начал охлаждать."); }
}
class WashingMachine extends Appliance {
    @Override void operate() { System.out.println("Стиральная машина начала стирку."); }
}
class Microwave extends Appliance {
    @Override void operate() { System.out.println("Микроволновка греет еду."); }
}
public class Task15 {
    public static void main(String[] args) {
        new Refrigerator().operate();
        new WashingMachine().operate();
    }
}