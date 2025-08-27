import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VerDrag2S extends JPanel {
    VerSlider slider1, slider2;

    public VerDrag2S() {
        setPreferredSize(new Dimension(300, 400));
        setBackground(Color.WHITE);

        slider1 = new VerSlider(128, 0, 255, 50, 300);
        slider2 = new VerSlider(200, 0, 255, 50, 300);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                checkAndMove(e.getX(), e.getY());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                checkAndMove(e.getX(), e.getY());
            }
        });
    }

    private void checkAndMove(int x, int y) {
        if (x < getWidth() / 2) {
            slider1.setValueFromY(y);
        } else {
            slider2.setValueFromY(y);
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int v1 = (int)slider1.getValue();
        int v2 = (int)slider2.getValue();

        g.setColor(new Color(v1, v2, 0));
        g.fillRect(120, 50, 60, 60);

        int y1 = slider1.getThumbY();
        g.setColor(Color.BLUE);
        g.fillOval(80, y1, 20, 20);
        g.setColor(Color.BLACK);
        g.drawString("" + v1, 110, y1 + 15);
        g.setColor(Color.GRAY);
        g.drawLine(90, 50, 90, 300);

        int y2 = slider2.getThumbY();
        g.setColor(Color.RED);
        g.fillOval(180, y2, 20, 20);
        g.setColor(Color.BLACK);
        g.drawString("" + v2, 210, y2 + 15);
        g.setColor(Color.GRAY);
        g.drawLine(190, 50, 190, 300);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("VerDrag2S");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new VerDrag2S());
        f.pack();
        f.setVisible(true);
    }
}
