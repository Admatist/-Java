package Lab13;

interface MathOperation {
    int operate(int a, int b);
}

public class Task1 {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b; // Лямбда-выражение[span_0](end_span)
                System.out.println("Сумма 5 + 10 = " + addition.operate(5, 10));
    }
}