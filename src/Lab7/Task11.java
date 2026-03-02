package Lab7;

public class Task11 {
    public static void main(String[] args) {
        int[] a = new int[25];
        int minIdx = 0, maxIdx = 0;
        for (int i = 0; i < 25; i++) {
            a[i] = (int) (Math.random() * 100);
            if (a[i] < a[minIdx]) minIdx = i;
            if (a[i] > a[maxIdx]) maxIdx = i;
        }
        int temp = a[minIdx];
        a[minIdx] = a[maxIdx];
        a[maxIdx] = temp;
        System.out.println("Max и Min поменялись местами.");
    }
}