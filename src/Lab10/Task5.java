package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task5 {
    static int count = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 5");
        JButton btn = new JButton("Счётчик");
        JLabel lbl = new JLabel("Нажатий: 0");

        btn.addActionListener(e -> {
            count++;
            lbl.setText("Нажатий: " + count);
        });

        frame.setLayout(new FlowLayout());
        frame.add(btn);
        frame.add(lbl);
        frame.setSize(250, 100);
        frame.setVisible(true);
    }
}