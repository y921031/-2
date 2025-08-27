import javax.swing.*;
import java.awt.*;

public class G08_4 extends JFrame {
    public G08_4() {
        setTitle("G08_4 Cardioid (心臟線)");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(getWidth() / 2, getHeight() / 2); // 置中
        g2.setColor(Color.RED);

        int scale = 100; // 放大倍率
        int prevX = 0, prevY = 0;
        boolean first = true;

        for (double theta = 0; theta <= 2 * Math.PI; theta += 0.01) {
            double r = 2 * (1 - Math.sin(theta));  // 心臟線的極座標
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);

            int drawX = (int) (x * scale);
            int drawY = (int) (y * scale);

            if (!first) {
                g2.drawLine(prevX, prevY, drawX, drawY);
            }
            prevX = drawX;
            prevY = drawY;
            first = false;
        }
    }

    public static void main(String[] args) {
        new G08_4().setVisible(true);
    }
}
