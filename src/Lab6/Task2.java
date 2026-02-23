package Lab6;
import java.util.Scanner;

public class Task2 {
    // Возвращает true, если чётное, и false, если нет
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}