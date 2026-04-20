package Lab14;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "12345";
        String input;
        do {
            System.out.println("Введите пароль:");
            input = sc.nextLine();
        } while (!input.equals(pass));
        System.out.println("Доступ разрешен!");
    }
}