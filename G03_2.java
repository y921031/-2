import javax.swing.*;

public class G03_2 {

        public static void main(String[] args) {
                // OK_CANCEL_OPTION
                JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

                // YES_NO_OPTION
                JOptionPane.showConfirmDialog(null, "Do you like Java?", "Question",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                // YES_NO_CANCEL_OPTION
                JOptionPane.showConfirmDialog(null, "Save changes before closing?", "Save",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                // Message + 自訂 Icon
                ImageIcon icon = new ImageIcon("phi.jpg"); // 確保檔案存在
                JOptionPane.showMessageDialog(null, "Custom Icon Example", "My Icon",
                                JOptionPane.PLAIN_MESSAGE, icon);
        }
}
