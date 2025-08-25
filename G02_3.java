import javax.swing.JFrame;

public class G02_3 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("G02_3");

        jf.setBounds(350, 250, 400, 200);

        // 測試不同的 close operation
		
		//EXIT_ON_CLOSE → 關閉程式
        //jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//DISPOSE_ON_CLOSE → 關閉當前視窗，但程式可能還在
        //jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//HIDE_ON_CLOSE → 關閉視窗但程式在背景執行
        //jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		//DO_NOTHING_ON_CLOSE → 點叉叉沒反應
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // 若省略下面這行，視窗將「不會顯示」
        //jf.setVisible(true);
    }
}
