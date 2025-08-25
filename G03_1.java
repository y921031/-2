import javax.swing.*;

public class G03_1 {

        static void test1() {
                JOptionPane.showConfirmDialog(null, "Are you sure?", "[Plain Message]",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                JOptionPane.showConfirmDialog(null, "Delete file?", "[Error Message]",
                                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

                JOptionPane.showConfirmDialog(null, "Continue program?", "[Information Message]",
                                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showConfirmDialog(null, "Do you want to save?", "[Warning Message]",
                                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                JOptionPane.showConfirmDialog(null, "Proceed with action?", "[Question Message]",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }

        public static void main(String[] args) {
                test1();
        }
}
