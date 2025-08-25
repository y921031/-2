import javax.swing.*;
import java.awt.*;

public class G04_4 extends JFrame {

    public G04_4() {
        setTitle("G04_4 正多邊形");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void drawPolygon(Graphics g, int sides, int x, int y, int r) {
        int[] px = new int[sides];
        int[] py = new int[sides];
        for (int i = 0; i < sides; i++) {
            px[i] = (int) (x + r * Math.cos(2 * Math.PI * i / sides));
            py[i] = (int) (y + r * Math.sin(2 * Math.PI * i / sides));
        }
        g.drawPolygon(px, py, sides);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        drawPolygon(g, 3, 120, 150, 60); // 三角形
        g.setColor(Color.RED);
        drawPolygon(g, 4, 280, 150, 60); // 正方形
        g.setColor(Color.GREEN);
        drawPolygon(g, 5, 120, 300, 60); // 五邊形
        g.setColor(Color.ORANGE);
        drawPolygon(g, 6, 280, 300, 60); // 六邊形
    }

    public static void main(String[] args) {
        new G04_4().setVisible(true);
    }
}
