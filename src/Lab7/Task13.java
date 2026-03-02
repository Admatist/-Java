package Lab7;

public class Task13 {
    public static void main(String[] args) {
        int[] c = new int[20];
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            c[i] = (int) (Math.random() * 50);
            sum += c[i];
        }
        System.out.println("Среднее C[20]: " + (sum / 20));
    }
}