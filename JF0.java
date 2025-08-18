
/*本學期的作業應繳交java檔及執行畫面的截圖
G02_1. 

   模仿JF0.java做一個程式, 改變它的位置與長寬.

   並在DOS視窗印出它的 X, Y, W, H.

G02_2. 

  模仿JF0.java做一個程式, 取得它的內容盤並將底色設為別的顏色.

G02_3. 

  模仿JF0.java做一個程式,

  a. 調整JF0中setDefaultCloseOperation的參數, 並觀察它的效果.

  b. JF0中setVisible(true)若省略, 會有什麼影響?

G02_4.
   寫出另外幾個視窗程式, 測試各種改變.*/
import javax.swing.JFrame;

public class JF0 {
  public static void main(String[] dummy) {
    JFrame jF0 = new JFrame("JF0");
    jF0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jF0.setBounds(400, 0, 330, 200);
    jF0.setVisible(true);
  }

}