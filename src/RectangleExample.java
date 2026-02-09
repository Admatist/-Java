import java.util.Scanner; // Импорт сканера для ввода данных

public class RectangleExample {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Ввод длины
        System.out.print("Введите длину прямоугольника (a): ");
        double a = scanner.nextDouble();

        // Ввод ширины
        System.out.print("Введите ширину прямоугольника (b): ");
        double b = scanner.nextDouble();

        // Вычисление площади (S = a * b)
        double area = a * b;

        // Вычисление периметра (P = 2 * (a + b))
        double perimeter = 2 * (a + b);

        // Вывод итогов
        System.out.println("--- Результаты ---");
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}