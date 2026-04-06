package Lab12;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.next();
        if (input.matches("\\d+")) {
            System.out.println("Строка содержит только цифры.");
        } else {
            System.out.println("В строке есть другие символы.");
        }
    }
}