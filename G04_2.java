import javax.swing.*;
import java.awt.*;

public class G04_2 extends JFrame {

    public G04_2() {
        setTitle("G04_2 顏色圓盤");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Color[] colors = {
                Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW,
                Color.ORANGE, Color.PINK, Color.GRAY, Color.BLACK,
                new Color(128, 0, 128), // 紫色
                new Color(0, 128, 128), // 青藍
                new Color(128, 64, 0) // 咖啡色
        };

        int x = 50, y = 100, r = 60;
        for (int i = 0; i < colors.length; i++) {
            g.setColor(colors[i]);
            g.fillOval(x, y, r, r);
            x += r + 10;
            if (x > 400) {
                x = 50;
                y += r + 10;
            }
        }
    }

    public static void main(String[] args) {
        new G04_2().setVisible(true);
    }
}
