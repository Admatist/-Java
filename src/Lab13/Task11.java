package Lab13;
import java.util.function.Consumer;
public class Task11 {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println("Output: " + s);
        printer.accept("Hello Lambda");
    }
}