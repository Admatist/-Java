package Lab11;
import java.util.Scanner;

public class SimpleCalc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.print("Операция (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') System.out.println("Результат: " + (a + b));
        else if (op == '-') System.out.println("Результат: " + (a - b));
        else if (op == '*') System.out.println("Результат: " + (a * b));
        else if (op == '/') System.out.println(b != 0 ? "Результат: " + (a / b) : "Ошибка: на 0 нельзя!");
    }
}