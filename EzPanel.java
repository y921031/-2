import javax.swing.*;
import java.awt.*;

// 簡化版 EzPanel，實際上就是 JPanel
public class EzPanel extends JPanel {

    public EzPanel() {
        // 建議打開雙重緩衝，避免閃爍
        this.setDoubleBuffered(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 留給子類別去畫
    }
}
