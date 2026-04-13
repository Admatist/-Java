package Lab13;
import java.util.*;
import java.util.stream.Collectors;
public class Task16 {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(20, 25, 20, 30, 25);
        Map<Integer, List<Integer>> grouped = ages.stream().collect(Collectors.groupingBy(a -> a));
        System.out.println(grouped);
    }
}