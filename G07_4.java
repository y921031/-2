import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class G07_4 extends JFrame {

    private ArrayList<Point> circles = new ArrayList<>();

    public G07_4() {
        setTitle("G07_4 雙圈圖(不被擦掉)");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        circles.add(new Point(100, 150));
        circles.add(new Point(180, 150));
    }

    public void paint(Graphics g) {
        super.paint(g);
        int r = 80;
        g.setColor(Color.BLUE);
        g.drawOval(circles.get(0).x - r, circles.get(0).y - r, 2 * r, 2 * r);
        g.setColor(Color.RED);
        g.drawOval(circles.get(1).x - r, circles.get(1).y - r, 2 * r, 2 * r);
    }

    public static void main(String[] args) {
        new G07_4().setVisible(true);
    }
}
