package Lab6;
import java.util.Scanner;

public class Task1 {
    // Метод принимает два параметра double и возвращает результат
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ширину: ");
        double w = sc.nextDouble();
        System.out.print("Введите высоту: ");
        double h = sc.nextDouble();

        // Вызываем метод и выводим результат
        System.out.println("Площадь прямоугольника: " + rectangleArea(w, h));
    }
}