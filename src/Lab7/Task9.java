package Lab7;

public class Task9 {
    public static void main(String[] args) {
        int[][] c = new int[5][5];
        long prod = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                c[i][j] = (int) (Math.random() * 10);
                if (i == j && c[i][j] > 0) prod *= c[i][j];
            }
        }
        System.out.println("Произведение диагонали: " + prod);
    }
}