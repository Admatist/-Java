package Lab10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task9 extends JPanel {
    int x = -50, y = -50;
    public Task9() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x - 10, y - 10, 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 9");
        frame.add(new Task9());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}