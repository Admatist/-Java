package Lab12;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную строку:");
        String text = scanner.nextLine();
        System.out.println("Что заменить?");
        String oldWord = scanner.next();
        System.out.println("На что заменить?");
        String newWord = scanner.next();
        System.out.println("Результат: " + text.replace(oldWord, newWord));
    }
}