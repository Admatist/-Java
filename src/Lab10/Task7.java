package Lab10;
import javax.swing.*;
import java.awt.*;

public class Task7 extends JPanel {
    Color ballColor = Color.BLACK;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(ballColor);
        g.fillOval(100, 50, 80, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание 7");
        Task7 panel = new Task7();
        JButton r = new JButton("Red");
        JButton g = new JButton("Green");
        JButton b = new JButton("Blue");

        r.addActionListener(e -> { panel.ballColor = Color.RED; panel.repaint(); });
        g.addActionListener(e -> { panel.ballColor = Color.GREEN; panel.repaint(); });
        b.addActionListener(e -> { panel.ballColor = Color.BLUE; panel.repaint(); });

        JPanel buttons = new JPanel();
        buttons.add(r); buttons.add(g); buttons.add(b);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttons, BorderLayout.SOUTH);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}