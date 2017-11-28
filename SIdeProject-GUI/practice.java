
/**
 * Write a description of class practice here.
 * Just a little practice to learn GUI components in Java.
 * 
 *
 * @author (Kong)
 * @version (11-28-17)
 */
import javax.swing.*;

public class practice
{
    public static void main() {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.setSize(500, 500);
        frame.add(button);
        button.setSize(100, 100);
        button.setVisible(true);
        frame.setVisible(true);
    }
}
