import javax.swing.*;
import java.awt.*;

public class G08_2 extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();
        g2.translate(w/2, h/2);
        g2.scale(1, -1);

        g2.setColor(Color.GRAY);
        g2.drawLine(-w/2, 0, w/2, 0);
        g2.drawLine(0, -h/2, 0, h/2);

        g2.setColor(Color.RED);
        int prevX = -100, prevY = (int)((Math.pow(prevX/20.0,3) - prevX/20.0)*20);
        for (int x=-100; x<=100; x++) {
            int y = (int)((Math.pow(x/20.0,3) - x/20.0)*20);
            g2.drawLine(prevX, prevY, x, y);
            prevX = x; prevY = y;
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("G08_2 y=x^3-x");
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new G08_2());
        f.setVisible(true);
    }
}