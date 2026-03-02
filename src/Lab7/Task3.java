package Lab7;

public class Task3 {
    public static void main(String[] args) {
        double[] a = new double[12];
        double prod = 1;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 10) - 5;
            if (a[i] < 0) {
                prod *= a[i];
                found = true;
            }
        }
        System.out.println("Произведение отрицательных в A[12]: " + (found ? prod : 0));
    }
}