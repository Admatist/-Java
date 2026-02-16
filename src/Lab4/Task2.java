package Lab4;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите балл (0-100): ");
        int score = sc.nextInt();

        if (score >= 90) System.out.println("Оценка: 5");
        else if (score >= 75) System.out.println("Оценка: 4");
        else if (score >= 60) System.out.println("Оценка: 3");
        else if (score >= 40) System.out.println("Оценка: 2");
        else System.out.println("Оценка: 1");
    }
}