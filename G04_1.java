import javax.swing.*;
import java.awt.*;

public class G04_1 extends JFrame {

    public G04_1() {
        setTitle("G04_1 雙圈圖");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int r = 80;
        int x1 = 100, y = 150;
        int x2 = x1 + r, y2 = y;

        g.setColor(Color.BLUE);
        g.drawOval(x1 - r, y - r, 2 * r, 2 * r);
        g.setColor(Color.RED);
        g.drawOval(x2 - r, y2 - r, 2 * r, 2 * r);
    }

    public static void main(String[] args) {
        new G04_1().setVisible(true);
    }
}
