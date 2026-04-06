package Lab12;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String input = scanner.next().toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("Это палиндром.");
        } else {
            System.out.println("Это не палиндром.");
        }
    }
}