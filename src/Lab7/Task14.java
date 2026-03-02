package Lab7;

public class Task14 {
    public static void main(String[] args) {
        int[] d = new int[30];
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < 30; i++) {
            d[i] = (int) (Math.random() * 100);
            if (d[i] % 2 == 0) evenSum += d[i];
            else oddSum += d[i];
        }
        System.out.println("Чётные: " + evenSum + ", Нечётные: " + oddSum);
    }
}