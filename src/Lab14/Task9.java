package Lab14;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        do { sum += i; i++; } while (i <= n);
        System.out.println("Сумма: " + sum);
    }
}
