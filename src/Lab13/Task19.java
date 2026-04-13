package Lab13;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Task19 {
    public static void main(String[] args) {
        List<List<Integer>> complex = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flat = complex.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flat);
    }
}