package Lab7;

public class Task5 {
    public static void main(String[] args) {
        double[] d = new double[17];
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            d[i] = Math.random() * 100;
            sum += d[i];
        }
        System.out.println("Среднее арифметическое D[17]: " + (sum / d.length));
    }
}