import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class G06_1b extends JFrame {
    private ArrayList<Point> points = new ArrayList<>();

    public G06_1b() {
        setTitle("G06_1b Draw6");
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
        g.setColor(Color.BLUE);
        for (Point p : points) {
            g.fillOval(p.x - 20, p.y - 20, 40, 40);
        }
    }

    public static void main(String[] args) {
        new G06_1b().setVisible(true);
    }
}
