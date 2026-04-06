package Lab12;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка 1:");
        String s1 = scanner.nextLine();
        System.out.println("Строка 2:");
        String s2 = scanner.nextLine();
        if (s1.equals(s2)) {
            System.out.println("Строки идентичны.");
        } else {
            System.out.println("Строки разные.");
        }
    }
}