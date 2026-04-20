package Lab14;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE, in;
        do {
            in = sc.nextInt();
            if (in != 0 && in < min) min = in;
        } while (in != 0);
        System.out.println("Мин: " + (min == Integer.MAX_VALUE ? 0 : min));
    }
}