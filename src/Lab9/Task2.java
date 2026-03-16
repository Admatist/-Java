package Lab9;

abstract class Shape { abstract void area(); }
class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    @Override void area() { System.out.println("Площадь круга: " + (Math.PI * r * r)); }
}
class Rectangle extends Shape {
    double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
    @Override void area() { System.out.println("Площадь прямоугольника: " + (w * h)); }
}
class Triangle extends Shape {
    double b, h;
    Triangle(double b, double h) { this.b = b; this.h = h; }
    @Override void area() { System.out.println("Площадь треугольника: " + (0.5 * b * h)); }
}
public class Task2 {
    public static void main(String[] args) {
        new Circle(5).area();
        new Rectangle(4, 6).area();
        new Triangle(3, 8).area();
    }
}