import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class G06_1c extends JFrame {
    private Rectangle rect = new Rectangle(150, 100, 100, 80);

    public G06_1c() {
        setTitle("G06_1c ResizeRectWheel");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseWheelListener(e -> {
            int notches = e.getWheelRotation();
            rect.width += notches * 10;
            rect.height += notches * 10;
            if (rect.width < 20) rect.width = 20;
            if (rect.height < 20) rect.height = 20;
            repaint();
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(rect.x, rect.y, rect.width, rect.height);
        g.setColor(Color.BLACK);
        g.drawRect(rect.x, rect.y, rect.width, rect.height);
    }

    public static void main(String[] args) {
        new G06_1c().setVisible(true);
    }
}
