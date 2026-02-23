package Lab6;
import java.util.Scanner;

public class Task4 {
    public static long factorial(int n) {
        // Обработка некорректного ввода
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён.");
            return -1;
        }
        // Базовый случай: 0! или 1! = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Рекурсивный шаг
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        long result = factorial(num);

        if (result != -1) {
            System.out.println("Факториал " + num + " равен: " + result);
        }
    }
}