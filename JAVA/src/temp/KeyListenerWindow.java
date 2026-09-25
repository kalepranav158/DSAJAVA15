import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Press any key...", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);

        panel.setFocusable(true);
        panel.requestFocusInWindow();

        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + e.getKeyChar());
            }
        });

        frame.add(panel);
        frame.setVisible(true);

        // Make sure panel gets focus once window opens
        SwingUtilities.invokeLater(() -> panel.requestFocusInWindow());
    }
}
