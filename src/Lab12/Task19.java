package Lab12;
import java.util.*;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : input.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        System.out.println("Частота символов: " + counts);
    }
}