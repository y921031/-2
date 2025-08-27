import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class G2R extends JFrame {

    private ArrayList<Point> points = new ArrayList<>();

    public G2R() {
        setTitle("G07_1 G2R");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Point p : points) {
            g.fillOval(p.x, p.y, 20, 20);
        }
    }

    public static void main(String[] args) {
        new G2R().setVisible(true);
    }
}
