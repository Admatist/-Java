package Lab13;
import java.util.Arrays;
import java.util.List;
public class Task5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 45, 2, 89, 7);
        nums.stream().max(Integer::compare).ifPresent(System.out::println);
    }
}
