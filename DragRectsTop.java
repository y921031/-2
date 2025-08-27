import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DragRectsTop extends JFrame {

    private ArrayList<Rectangle> rects = new ArrayList<>();
    private Rectangle selected = null;
    private int dx, dy;

    public DragRectsTop() {
        setTitle("G07_2 DragRectsTop");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        rects.add(new Rectangle(50, 50, 80, 60));
        rects.add(new Rectangle(120, 100, 100, 80));
        rects.add(new Rectangle(200, 150, 120, 90));

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                for (int i = rects.size() - 1; i >= 0; i--) {
                    Rectangle r = rects.get(i);
                    if (r.contains(e.getPoint())) {
                        selected = r;
                        dx = e.getX() - r.x;
                        dy = e.getY() - r.y;
                        rects.remove(r);
                        rects.add(r); // 移到最上層
                        break;
                    }
                }
            }
            public void mouseReleased(MouseEvent e) {
                selected = null;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (selected != null) {
                    selected.setLocation(e.getX() - dx, e.getY() - dy);
                    repaint();
                }
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Rectangle r : rects) {
            g.setColor(Color.BLUE);
            g.fillRect(r.x, r.y, r.width, r.height);
            g.setColor(Color.BLACK);
            g.drawRect(r.x, r.y, r.width, r.height);
        }
    }

    public static void main(String[] args) {
        new DragRectsTop().setVisible(true);
    }
}
