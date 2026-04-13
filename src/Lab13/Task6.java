package Lab13;
import java.util.Arrays;
import java.util.List;
public class Task6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Lambda");
        words.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);
    }
}