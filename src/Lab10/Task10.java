package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task10 extends JPanel {
    String message = "";
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillRect(100, 50, 100, 50);
        g.setColor(Color.BLACK);
        g.drawString(message, 110, 120);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 10");
        Task10 panel = new Task10();
        JTextField field = new JTextField(10);
        JButton btn = new JButton("Show");

        btn.addActionListener(e -> {
            panel.message = field.getText();
            panel.repaint();
        });

        JPanel ctrl = new JPanel();
        ctrl.add(field); ctrl.add(btn);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(ctrl, BorderLayout.SOUTH);
        frame.setSize(350, 300);
        frame.setVisible(true);
    }
}