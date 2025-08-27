import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DragRectsW extends JFrame {

    private ArrayList<Rectangle> rects = new ArrayList<>();
    private Rectangle selected = null;

    public DragRectsW() {
        setTitle("G07_3 DragRectsW");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        rects.add(new Rectangle(100, 100, 80, 60));
        rects.add(new Rectangle(200, 200, 100, 80));

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                selected = null;
                for (Rectangle r : rects) {
                    if (r.contains(e.getPoint())) {
                        selected = r;
                        break;
                    }
                }
            }
        });

        addMouseWheelListener(e -> {
            if (selected != null) {
                int notches = e.getWheelRotation();
                selected.width += notches * 5;
                selected.height += notches * 5;
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Rectangle r : rects) {
            g.setColor(Color.GREEN);
            g.fillRect(r.x, r.y, r.width, r.height);
            g.setColor(Color.BLACK);
            g.drawRect(r.x, r.y, r.width, r.height);
        }
    }

    public static void main(String[] args) {
        new DragRectsW().setVisible(true);
    }
}
