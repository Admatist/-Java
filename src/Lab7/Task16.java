package Lab7;

public class Task16 {
    public static int maxX(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }
    public static void main(String[] args) {
        int[] data = {5, 12, 3, 9, 21, 8};
        System.out.println("Максимум: " + maxX(data));
    }
}