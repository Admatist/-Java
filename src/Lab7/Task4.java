package Lab7;

public class Task4 {
    public static void main(String[] args) {
        int[] c = new int[25];
        long prod = 1;
        boolean found = false;
        for (int i = 0; i < c.length; i++) {
            c[i] = (int) (Math.random() * 10);
            if (c[i] > 0) {
                prod *= c[i];
                found = true;
            }
        }
        System.out.println("Произведение положительных в C[25]: " + (found ? prod : 0));
    }
}