import javax.swing.*;
import java.awt.*;

public class G08_3 extends JFrame {
    public G08_3() {
        setTitle("G08_3 Hypotrochoid (內擺線)");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(getWidth() / 2, getHeight() / 2); // 置中
        g2.setColor(Color.BLUE);

        double R = 5, r = 3, d = 5;
        int scale = 40; // 放大倍率

        int prevX = 0, prevY = 0;
        boolean first = true;

        for (double t = 0; t <= Math.PI * 20; t += 0.01) {
            double x = (R - r) * Math.cos(t) + d * Math.cos(((R / r) - 1) * t);
            double y = (R - r) * Math.sin(t) - d * Math.sin(((R / r) - 1) * t);

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
        new G08_3().setVisible(true);
    }
}
