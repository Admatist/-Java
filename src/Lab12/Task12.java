package Lab12;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String[] words = scanner.nextLine().split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Самое длинное слово: " + longest);
    }
}