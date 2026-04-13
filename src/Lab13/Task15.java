package Lab13;
import java.util.Arrays;
import java.util.List;
public class Task15 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ivan", "anna", "boris", "alex");
        names.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}