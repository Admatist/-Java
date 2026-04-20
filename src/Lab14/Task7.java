package Lab14;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Первое число: ");
            int a = sc.nextInt();
            System.out.print("Второе число: ");
            int b = sc.nextInt();
            System.out.println("Сумма: " + (a + b));
            sc.nextLine();
            System.out.print("Еще раз? (yes/no): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}