package Lab14;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n > 0);
        System.out.println("Сумма цифр: " + sum);
    }
}
