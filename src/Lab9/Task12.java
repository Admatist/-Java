package Lab9;

class Instrument {
    void playSound() { System.out.println("Инструмент звучит."); }
}
class Guitar extends Instrument {
    @Override void playSound() { System.out.println("Гитара: Брям-брям!"); }
}
class Piano extends Instrument {
    @Override void playSound() { System.out.println("Пианино: До-ре-ми!"); }
}
class Drums extends Instrument {
    @Override void playSound() { System.out.println("Барабаны: Бум-бац!"); }
}
public class Task12 {
    public static void main(String[] args) {
        new Guitar().playSound();
        new Drums().playSound();
    }
}