package Lab12;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        System.out.println("ВЕРХНИЙ РЕГИСТР: " + input.toUpperCase());
        System.out.println("нижний регистр: " + input.toLowerCase());
    }
}
