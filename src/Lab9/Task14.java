package Lab9;

class Character {
    void attack() { System.out.println("Персонаж атакует."); }
}
class Warrior extends Character {
    @Override void attack() { System.out.println("Воин бьет мечом!"); }
}
class Mage extends Character {
    @Override void attack() { System.out.println("Маг пускает огненный шар!"); }
}
class Archer extends Character {
    @Override void attack() { System.out.println("Лучник стреляет из лука!"); }
}
public class Task14 {
    public static void main(String[] args) {
        new Warrior().attack();
        new Mage().attack();
    }
}