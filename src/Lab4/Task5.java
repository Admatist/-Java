package Lab4;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        if (n % 2 == 0) System.out.println("Число чётное");
        else System.out.println("Число нечётное");
    }
}