package Lab4;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        if (a > b) System.out.println(a + " больше чем " + b);
        else if (b > a) System.out.println(b + " больше чем " + a);
        else System.out.println("Числа равны");
    }
}