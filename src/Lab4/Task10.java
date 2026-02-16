package Lab4;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Число 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Операция (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Число 2: ");
        double n2 = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("Результат: " + (n1 + n2)); break;
            case '-': System.out.println("Результат: " + (n1 - n2)); break;
            case '*': System.out.println("Результат: " + (n1 * n2)); break;
            case '/':
                if (n2 != 0) System.out.println("Результат: " + (n1 / n2));
                else System.out.println("Ошибка: деление на ноль");
                break;
            default: System.out.println("Неверная операция");
        }
    }
}