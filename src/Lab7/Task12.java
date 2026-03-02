package Lab7;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] b = new int[25];
        for (int i = 0; i < 25; i++) b[i] = (int) (Math.random() * 100);
        Arrays.sort(b);
        System.out.println("Отсортированный массив: " + Arrays.toString(b));
    }
}