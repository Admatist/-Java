package Lab12;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку (например, через запятую):");
        String input = scanner.nextLine();
        System.out.println("Введите разделитель (например, ','):");
        String delimiter = scanner.nextLine();
        String[] parts = input.split(delimiter);
        System.out.println("Части строки:");
        for (String p : parts) System.out.println(p.trim());
    }
}