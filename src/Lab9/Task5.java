package Lab9;

class Person {
    String name;
    Person(String name) { this.name = name; }
}
class Student extends Person {
    Student(String name) { super(name); }
    void study() { System.out.println(name + " учит лекции."); }
}
class Teacher extends Person {
    Teacher(String name) { super(name); }
    void teach() { System.out.println(name + " объясняет тему."); }
}
class Administrator extends Person {
    Administrator(String name) { super(name); }
    void manage() { System.out.println(name + " составляет расписание."); }
}
public class Task5 {
    public static void main(String[] args) {
        new Student("Дамир").study();
        new Teacher("Ольга Петровна").teach();
        new Administrator("Григорий").manage();
    }
}