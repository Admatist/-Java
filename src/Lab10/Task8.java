package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task8 extends JPanel {
    int x = 0;
    public Task8() {
        Timer timer = new Timer(15, e -> {
            x++;
            if (x > getWidth()) x = -30;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, 80, 30, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 8");
        frame.add(new Task8());
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}