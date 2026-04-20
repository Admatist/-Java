package Lab14;
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, in;
        do { in = sc.nextInt(); sum += in; } while (in != 0);
        System.out.println("Сумма: " + sum);
    }
}
