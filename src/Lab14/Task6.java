package Lab14;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Работаем...");
            System.out.println("Продолжить? (yes/no):");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}