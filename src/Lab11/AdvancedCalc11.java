package Lab11;
import java.util.ArrayList;

public class AdvancedCalc11 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();

        double num = 16;
        double root = Math.sqrt(num);

        history.add("Sqrt of " + num + " is " + root);
        System.out.println("History: " + history);
    }
}