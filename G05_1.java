import javax.swing.*;
import java.awt.event.*;

public class G05_1 extends JFrame {

    public G05_1() {
        setTitle("G05_1 視窗可用方向鍵移動");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 300);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int x = getX();
                int y = getY();
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP: setLocation(x, y - 10); break;
                    case KeyEvent.VK_DOWN: setLocation(x, y + 10); break;
                    case KeyEvent.VK_LEFT: setLocation(x - 10, y); break;
                    case KeyEvent.VK_RIGHT: setLocation(x + 10, y); break;
                }
            }
        });
    }

    public static void main(String[] args) {
        new G05_1().setVisible(true);
    }
}
