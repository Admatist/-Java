package Lab7;

public class Task2 {
    public static void main(String[] args) {
        double[] d = new double[17];
        double sum = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < d.length; i++) {
            d[i] = Math.random() * 100;
            sum += d[i];
            System.out.printf("%.2f ", d[i]);
        }
        System.out.printf("\nСреднее арифметическое: %.2f", (sum / d.length));
    }
}