package Lab9;

class Component {
    String model;
    Component(String model) { this.model = model; }
    void showInfo() { System.out.println("Компонент: " + model); }
}
class CPU extends Component {
    CPU(String m) { super(m); }
    @Override void showInfo() { System.out.println("Процессор: " + model); }
}
class RAM extends Component {
    RAM(String m) { super(m); }
    @Override void showInfo() { System.out.println("Память: " + model); }
}
class GPU extends Component {
    GPU(String m) { super(m); }
    @Override void showInfo() { System.out.println("Видеокарта: " + model); }
}
public class Task9 {
    public static void main(String[] args) {
        new CPU("Intel i7").showInfo();
        new GPU("NVIDIA RTX 3060").showInfo();
    }
}