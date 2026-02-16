package Lab5;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Чётные числа от 1 до 100:");
        while (i < 100) {
            i++;
            if (i % 2 != 0) {
                continue; // пропускаем нечётные
            }
            System.out.print(i + " ");
        }
    }
}