package Lab11;
import java.util.Scanner;

public class LoopCalc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число: ");
            double a = sc.nextDouble();
            System.out.print("Еще одно: ");
            double b = sc.nextDouble();
            System.out.println("Сумма: " + (a + b));

            System.out.print("Продолжить? (yes/no): ");
            if (sc.next().equalsIgnoreCase("no")) break;
        }
    }
}