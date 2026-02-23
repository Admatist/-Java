package Lab6;

public class Task3 {
    // Метод для целых чисел
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Тот же метод, но для double
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        // Проверка обеих версий
        System.out.println("Максимум (int): " + max(10, 25));
        System.out.println("Максимум (double): " + max(12.5, 30.7));
    }
}