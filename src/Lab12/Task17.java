package Lab12;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с цифрами:");
        String input = scanner.nextLine();
        System.out.println("Результат: " + input.replaceAll("\\d", ""));
    }
}