package Lab13;
import java.util.*;
class Student {
    String name; double grade;
    Student(String n, double g) { name = n; grade = g; }
    @Override public String toString() { return name + ":" + grade; }
}
public class Task14 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("A", 85), new Student("B", 70), new Student("C", 95));
        students.stream().filter(s -> s.grade > 80).sorted(Comparator.comparing(s -> s.name)).forEach(System.out::println);
    }
}