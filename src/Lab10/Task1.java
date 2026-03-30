package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 70, 45);
        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 270, 45);
        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 90, 195);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Task1());
        frame.setSize(450, 300);
        frame.setVisible(true);
    }
}