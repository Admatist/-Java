package Lab12;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        int count = input.replace(" ", "").length();
        System.out.println("Количество символов (без пробелов): " + count);
    }
}