package Lab4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();

        if (num > 0) System.out.println("Положительное");
        else if (num < 0) System.out.println("Отрицательное");
        else System.out.println("Равно нулю");
    }
}