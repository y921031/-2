import javax.swing.*;
import java.awt.*;

public class G08_1 extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();
        g2.translate(w/2, h/2); // 原點移到中心
        g2.scale(1, -1);        // y 軸向上

        // 座標軸
        g2.setColor(Color.GRAY);
        g2.drawLine(-w/2, 0, w/2, 0);
        g2.drawLine(0, -h/2, 0, h/2);

        // cos(x)
        g2.setColor(Color.BLUE);
        int prevX = -200, prevY = (int)(50*Math.cos(-200/50.0));
        for (int x=-200; x<=200; x++) {
            int y = (int)(50*Math.cos(x/50.0));
            g2.drawLine(prevX, prevY, x, y);
            prevX = x; prevY = y;
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("G08_1 y=cos(x)");
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new G08_1());
        f.setVisible(true);
    }
}
