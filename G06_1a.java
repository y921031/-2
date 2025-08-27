import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class G06_1a extends JFrame {
    private int x = -1, y = -1;

    public G06_1a() {
        setTitle("G06_1a CrossLine");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (x >= 0 && y >= 0) {
            g.setColor(Color.RED);
            g.drawLine(0, y, getWidth(), y);
            g.drawLine(x, 0, x, getHeight());
        }
    }

    public static void main(String[] args) {
        new G06_1a().setVisible(true);
    }
}
