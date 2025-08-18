import javax.swing.*;
import java.awt.*;

public class G02_2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("G02_2");

        Container cp = jf.getContentPane();

        cp.setBackground(Color.CYAN);

        jf.setBounds(300, 200, 400, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
