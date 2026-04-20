package Lab14;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        long fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        System.out.println("Факториал: " + fact);
    }
}