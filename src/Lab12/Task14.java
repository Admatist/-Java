package Lab12;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка:");
        String input = scanner.nextLine();
        System.out.println("Префикс для проверки:");
        String prefix = scanner.next();
        System.out.println("Начинается на '" + prefix + "': " + input.startsWith(prefix));
    }
}