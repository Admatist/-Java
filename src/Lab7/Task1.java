package Lab7;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {-5, 10, -2, 4, -8, 1, 0, -3, 15, -7, 2, -1, 6, -4, 9, -10, 3, -6, 8, -12};
        int sum = 0;
        for (int x : a) {
            if (x < 0) {
                sum += x;
            }
        }
        System.out.println("Сумма отрицательных элементов: " + sum);
    }
}