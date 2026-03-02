package Lab7;

public class Task2 {
    public static void main(String[] args) {
        int[] b = new int[15];
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100) - 50;
            if (b[i] > 0) sum += b[i];
        }
        System.out.println("Сумма положительных в B[15]: " + sum);
    }
}