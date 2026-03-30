package Lab11;
import javax.swing.*;
import java.awt.*;

public class GuiCalc11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);
        JButton btn = new JButton("=");
        JLabel res = new JLabel("?");

        btn.addActionListener(e -> {
            double sum = Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
            res.setText(String.valueOf(sum));
        });

        frame.setLayout(new FlowLayout());
        frame.add(t1); frame.add(new JLabel("+")); frame.add(t2);
        frame.add(btn); frame.add(res);

        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}