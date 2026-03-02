package Lab7;

public class Task10 {
    public static void main(String[] args) {
        double[][] d = new double[7][7];
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                d[i][j] = Math.random() * 100;
                if (i == j) sum += d[i][j];
            }
        }
        System.out.println("Среднее диагонали: " + (sum / 7));
    }
}