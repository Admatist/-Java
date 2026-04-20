package Lab14;
import java.util.Random;
public class Task15 {
    public static void main(String[] args) {
        Random r = new Random();
        int n;
        do { n = r.nextInt(10); System.out.println(n); } while (n != 0);
    }
}