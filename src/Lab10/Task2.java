package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task2 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, 80, 80);
        g.setColor(Color.GREEN);
        g.fillOval(150, 50, 80, 80);
        g.setColor(Color.BLUE);
        g.fillRoundRect(250, 50, 80, 80, 20, 20);
        g.setColor(Color.ORANGE);
        g.drawString("Colored Shapes", 150, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 2");
        frame.add(new Task2());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}