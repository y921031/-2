import javax.swing.*;
import java.awt.event.*;

public class G05_2 extends JFrame {

    private int lastX, lastY;

    public G05_2() {
        setTitle("G05_2 拖曳調整視窗大小");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getXOnScreen();
                lastY = e.getYOnScreen();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int dx = e.getXOnScreen() - lastX;
                int dy = e.getYOnScreen() - lastY;
                setSize(getWidth() + dx, getHeight() + dy);
                lastX = e.getXOnScreen();
                lastY = e.getYOnScreen();
            }
        });
    }

    public static void main(String[] args) {
        new G05_2().setVisible(true);
    }
}
