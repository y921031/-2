import javax.swing.*;

public class G03_3 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What's your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));

        String msg = "Hello " + name + ", you are " + age + " years old.";
        JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
