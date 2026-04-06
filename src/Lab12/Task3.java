package Lab12;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine().trim();
        if (sentence.isEmpty()) {
            System.out.println("Количество слов: 0");
        } else {
            String[] words = sentence.split(" ");
            System.out.println("Количество слов: " + words.length);
        }
    }
}