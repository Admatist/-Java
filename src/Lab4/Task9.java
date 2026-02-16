package Lab4;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для проверки (диапазон 10-50): ");
        int x = sc.nextInt();

        if (x >= 10 && x <= 50) System.out.println("Число попадает в диапазон");
        else System.out.println("Число вне диапазона");
    }
}