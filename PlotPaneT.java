//import javax..swing.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

//public class PlotPaneT extends SimplePane1 {
public class PlotPaneT extends EzPanel{

    // static final int R10=10;
    final int R10=10;
    final int R20=20;
    final int R30=30;

    public void MouseEntered(MouseEvent ev){
        final Graphics gr = this.getGraphics();
        gr.drawRect(0, 0, getWidth()-1, getHeight()-1);
    }
    public void mouseExited(MouseEvent ev){
        final Graphics gr = this.getGraphics();
        gr.setColor(getBackground());
        gr.fillRect(0, 0, getWidth(), getHeight());
    }
    public void mousePressed(MouseEvent ev){
        final int x=ev.getX(), y=ev.getY();
        final Graphics gr = this.getGraphics();
        gr.drawOval(x-R20, y-R20, R20*2, R20*2);
    }
    public void mouseReleased(MouseEvent ev){
        final int x=ev.getX(), y=ev.getY();
        final Graphics gr = this.getGraphics();
        gr.drawOval(x-R30, y-R30, R30*2, R30*2);
    }
    public void mouseClicked(MouseEvent ev){
        final int x=ev.getX(), y=ev.getY();
        final Graphics gr = this.getGraphics();
        gr.fillOval(x-R10, y-R10, R10*2, R10*2);
    }

    //====================================================
    public static void main(String[] dummy) {
        final JFrame mf = new  JFrame("Plot");
        mf.setBounds(100, 50, 400, 300);
        final PlotPaneT myPanel = new PlotPaneT();
        mf.setContentPane(myPanel);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }
}
