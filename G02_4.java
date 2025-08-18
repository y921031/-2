import javax.swing.*;
import java.awt.*;

public class G02_4 {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("視窗1 - 紅色");
        jf1.getContentPane().setBackground(Color.RED);
        jf1.setBounds(100, 100, 200, 150);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setVisible(true);

        JFrame jf2 = new JFrame("視窗2 - 綠色");
        jf2.getContentPane().setBackground(Color.GREEN);
        jf2.setBounds(350, 100, 250, 200);
        jf2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf2.setVisible(true);

        JFrame jf3 = new JFrame("視窗3 - 藍色");
        jf3.getContentPane().setBackground(Color.BLUE);
        jf3.setBounds(650, 100, 300, 250);
        jf3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jf3.setVisible(true);
    }
}
