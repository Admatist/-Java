package Lab14;
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int count = 0;
        do { if ((n % 10) % 2 == 0) count++; n /= 10; } while (n > 0);
        System.out.println("Четных цифр: " + count);
    }
}