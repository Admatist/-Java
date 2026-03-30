package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 6");
        JTextField input = new JTextField(10);
        JButton btn = new JButton("Ок");
        JLabel output = new JLabel("Введите имя");

        btn.addActionListener(e -> output.setText("Привет, " + input.getText()));

        frame.setLayout(new FlowLayout());
        frame.add(input);
        frame.add(btn);
        frame.add(output);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}