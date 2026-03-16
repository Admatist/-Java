package Lab9;

class Animal {
    void makeSound() { System.out.println("Животное издает звук"); }
}
class Lion extends Animal {
    @Override void makeSound() { System.out.println("Лев рычит: Рррр!"); }
}
class Elephant extends Animal {
    @Override void makeSound() { System.out.println("Слон трубит: Туууу!"); }
}
class Monkey extends Animal {
    @Override void makeSound() { System.out.println("Обезьяна кричит: У-а-а!"); }
}
public class Task7 {
    public static void main(String[] args) {
        new Lion().makeSound();
        new Elephant().makeSound();
        new Monkey().makeSound();
    }
}