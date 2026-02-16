package Lab4;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = sc.nextInt();

        if (age >= 18) System.out.println("Доступ разрешен");
        else System.out.println("Доступ запрещен (вам меньше 18 лет)");
    }
}