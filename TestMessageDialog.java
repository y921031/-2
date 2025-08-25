
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TestMessageDialog {

  static final String msgTypeValue = "PLAIN_MESSAGE= " + JOptionPane.PLAIN_MESSAGE +
      ", ERROR_MESSAGE= " + JOptionPane.ERROR_MESSAGE +
      ", INFORMATION_MESSAGE= " + JOptionPane.INFORMATION_MESSAGE +
      ", WARNING_MESSAGE= " + JOptionPane.WARNING_MESSAGE +
      ", QUESTION_MESSAGE= " + JOptionPane.QUESTION_MESSAGE;

  static void testConstants() {
    System.out.println(msgTypeValue);
  }

  static void testMsgTypes() {
    JOptionPane.showMessageDialog(null, "Hello, how are you. ", "[Plain Message]", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "Something wrong", "[Error Message]", JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null, "This is a programming course", "[Information Message]",
        JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Look out", "[Warning Message]", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, "What?", "[Question Message]", JOptionPane.QUESTION_MESSAGE);
    final ImageIcon myIcon = new ImageIcon("phi.jpg");
    JOptionPane.showMessageDialog(null, msgTypeValue, "[use icon]", JOptionPane.PLAIN_MESSAGE, myIcon);
  }

  public void testConvenienceMethods() {
    JOptionPane.showMessageDialog(null, msgTypeValue);
  }

  public static void main(String[] dummy) {
    testMsgTypes();
  }
}