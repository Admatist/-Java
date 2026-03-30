package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 4");
        JButton btn = new JButton("Нажми");
        JLabel lbl = new JLabel("");

        btn.addActionListener(e -> lbl.setText("Нажал!"));

        frame.setLayout(new FlowLayout());
        frame.add(btn);
        frame.add(lbl);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}