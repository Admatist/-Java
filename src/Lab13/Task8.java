package Lab13;
import java.util.Arrays;
import java.util.List;
public class Task8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Programming", "Code", "StreamAPI");
        words.stream().filter(s -> s.length() > 5).forEach(System.out::println);
    }
}