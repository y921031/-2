import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class G07_5 extends JFrame {

    private int x1 = 100, y1 = 150;
    private int r = 80;
    private int dx, dy;
    private boolean dragging = false;

    public G07_5() {
        setTitle("G07_5 雙圈可拖曳");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (new Rectangle(x1 - r, y1 - r, 2 * r + r, 2 * r).contains(x, y)) {
                    dragging = true;
                    dx = x - x1;
                    dy = y - y1;
                }
            }
            public void mouseReleased(MouseEvent e) {
                dragging = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (dragging) {
                    x1 = e.getX() - dx;
                    y1 = e.getY() - dy;
                    repaint();
                }
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawOval(x1 - r, y1 - r, 2 * r, 2 * r);
        g.setColor(Color.RED);
        g.drawOval(x1, y1 - r, 2 * r, 2 * r);
    }

    public static void main(String[] args) {
        new G07_5().setVisible(true);
    }
}
