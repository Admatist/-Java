package Lab13;
import java.util.*;
class User {
    String name; int age;
    User(String n, int a) { name = n; age = a; }
    public int getAge() { return age; }
    @Override public String toString() { return name + ":" + age; }
}
public class Task13 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Ivan", 25), new User("Anna", 20));
        users.stream().sorted(Comparator.comparing(User::getAge)).forEach(System.out::println);
    }
}