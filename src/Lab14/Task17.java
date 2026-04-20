package Lab14;
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p;
        do { System.out.println("Пароль (>6 симв):"); p = sc.nextLine(); } while (p.length() <= 6);
        System.out.println("Ок");
    }
}