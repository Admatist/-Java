package Lab9;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) { this.name = name; this.salary = salary; }
    void work() { System.out.println(name + " выполняет обязанности."); }
}
class Manager extends Employee {
    Manager(String n, double s) { super(n, s); }
    @Override void work() { System.out.println("Менеджер " + name + " управляет проектом."); }
}
class Developer extends Employee {
    Developer(String n, double s) { super(n, s); }
    @Override void work() { System.out.println("Разработчик " + name + " пишет код."); }
}
class Designer extends Employee {
    Designer(String n, double s) { super(n, s); }
    @Override void work() { System.out.println("Дизайнер " + name + " рисует макет."); }
}
public class Task3 {
    public static void main(String[] args) {
        new Manager("Иван", 5000).work();
        new Developer("Алекс", 4500).work();
        new Designer("Мария", 4000).work();
    }
}