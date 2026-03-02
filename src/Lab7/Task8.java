package Lab7;

public class Task8 {
    public static void main(String[] args) {
        double[][] a = new double[12][6];
        for (int j = 0; j < 6; j++) {
            double colProd = 1;
            boolean found = false;
            for (int i = 0; i < 12; i++) {
                a[i][j] = (Math.random() * 10) - 5;
                if (a[i][j] < 0) {
                    colProd *= a[i][j];
                    found = true;
                }
            }
            System.out.println("Столбец " + j + " произведение: " + (found ? colProd : 0));
        }
    }
}