package Lab6;

public class Task5 {
    public static int power(int base, int exponent) {
        // Базовый случай: любая база в степени 0 равна 1
        if (exponent == 0) {
            return 1;
        }
        // Рекурсия для вычисления степени
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        int b = 2;
        int e = 5;
        System.out.println(b + " в степени " + e + " равно: " + power(b, e));
    }
}