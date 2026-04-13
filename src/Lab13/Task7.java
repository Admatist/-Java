package Lab13;
import java.util.Arrays;
import java.util.List;
public class Task7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).forEach(System.out::println);
    }
}