package Lab12;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка:");
        String input = scanner.nextLine();
        System.out.println("Суффикс для проверки:");
        String suffix = scanner.next();
        System.out.println("Заканчивается на '" + suffix + "': " + input.endsWith(suffix));
    }
}