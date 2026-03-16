package Lab9;

class Course {
    void startCourse() { System.out.println("Курс запущен."); }
}
class ProgrammingCourse extends Course {
    @Override void startCourse() { System.out.println("Курс программирования начался (Пишем код)."); }
}
class MathCourse extends Course {
    @Override void startCourse() { System.out.println("Курс математики начался (Решаем задачи)."); }
}
class HistoryCourse extends Course {
    @Override void startCourse() { System.out.println("Курс истории начался (Изучаем даты)."); }
}
public class Task13 {
    public static void main(String[] args) {
        new ProgrammingCourse().startCourse();
    }
}