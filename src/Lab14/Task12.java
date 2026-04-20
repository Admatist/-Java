package Lab14;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int max = 0;
        do {
            if (n % 10 > max) max = n % 10;
            n /= 10;
        } while (n > 0);
        System.out.println("Макс. цифра: " + max);
    }
}