package Lab9;

class TeamMember {
    void play() { System.out.println("Участвует в игре."); }
    void train() { System.out.println("Тренируется."); }
    void heal() { System.out.println("Проходит осмотр."); }
}
class Player extends TeamMember {
    @Override void play() { System.out.println("Игрок на поле."); }
}
class Coach extends TeamMember {
    @Override void train() { System.out.println("Тренер проводит тренировку."); }
}
class Doctor extends TeamMember {
    @Override void heal() { System.out.println("Врач лечит игрока."); }
}
public class Task11 {
    public static void main(String[] args) {
        new Player().play();
        new Coach().train();
        new Doctor().heal();
    }
}