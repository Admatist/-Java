package Lab7;

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200) - 100;
            if (a[i] < 0) sum += a[i];
        }
        System.out.println("Сумма отрицательных в A[20]: " + sum);
    }
}