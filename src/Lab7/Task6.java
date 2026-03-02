package Lab7;

public class Task6 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            int rowSum = 0;
            for (int j = 0; j < 10; j++) {
                a[i][j] = (int) (Math.random() * 20) - 10;
                if (a[i][j] < 0) rowSum += a[i][j];
            }
            b[i] = rowSum;
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}