package Lab11;

public class MethodsCalc11 {
    public static double add(double a, double b) { return a + b; }
    public static double div(double a, double b) { return b != 0 ? a / b : 0; }

    public static void main(String[] args) {
        System.out.println("10 + 5 = " + add(10, 5));
        System.out.println("10 / 2 = " + div(10, 2));
    }
}