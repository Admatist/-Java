package Lab13;
import java.util.Arrays;
import java.util.List;
public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 2, 33, 4);
        System.out.println("Min: " + list.stream().min(Integer::compare).orElse(0));
    }
}