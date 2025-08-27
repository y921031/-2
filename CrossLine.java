//import javax..swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class CrossLine extends EzPanel{

    public void MouseMoved(MouseEvent ev){
        final Graphics g=getGraphics();
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        final int x=ev.getX(), y=ev.getY();
        g.setColor(Color.BLUE);
        g.drawLine(0, y, getHeight(), y);
        g.drawLine(x, 0, x, getHeight());
    }
    public void mouseExited(MouseEvent ev){
        final Graphics g=getGraphics();
        gr.setColor(getBackground());
        gr.fillRect(0, 0, getWidth(), getHeight());
    }


    //====================================================
    public static void main(String[] dummy) {
        final JFrame mf = new  JFrame("cross line");
        mf.setBounds(100, 50, 400, 300);
        final CrossLine myPanel = new CrossLine();
        mf.setContentPane(myPanel);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }
}



