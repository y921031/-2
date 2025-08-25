import javax.swing.*;
import java.awt.*;

public class G04_3 extends JFrame {

    public G04_3() {
        setTitle("G04_3 字型展示");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        String text = "Java";
        int y = 100;

        Font[] fonts = {
                new Font("Serif", Font.PLAIN, 60),
                new Font("Serif", Font.BOLD, 60),
                new Font("SansSerif", Font.ITALIC, 60),
                new Font("Monospaced", Font.BOLD | Font.ITALIC, 60)
        };

        for (Font f : fonts) {
            g.setFont(f);
            g.drawString(text, 100, y);
            y += 80;
        }
    }

    public static void main(String[] args) {
        new G04_3().setVisible(true);
    }
}
