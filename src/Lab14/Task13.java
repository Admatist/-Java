package Lab14;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n, rev = 0;
        do { rev = rev * 10 + n % 10; n /= 10; } while (n > 0);
        System.out.println(org == rev ? "Палиндром" : "Нет");
    }
}