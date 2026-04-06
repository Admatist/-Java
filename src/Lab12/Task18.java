package Lab12;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        System.out.println("Результат: " + input.replaceAll("(?i)[aeiouyаеёиоуыэюя]", "*"));
    }
}