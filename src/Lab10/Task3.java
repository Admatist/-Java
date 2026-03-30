package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task3 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.MAGENTA);
        g.drawString("Hello Java Swing", 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 3");
        frame.add(new Task3());
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}