package Lab7;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] b = new int[25];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 50);
        }
        System.out.println("До сортировки: " + Arrays.toString(b));
        Arrays.sort(b); // Стандартная сортировка Java
        System.out.println("После сортировки: " + Arrays.toString(b));
    }
}