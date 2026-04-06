package Lab12;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println("Введите слово для поиска:");
        String word = scanner.next();
        if (text.contains(word)) {
            System.out.println("Слово найдено!");
        } else {
            System.out.println("Слово не найдено.");
        }
    }
}