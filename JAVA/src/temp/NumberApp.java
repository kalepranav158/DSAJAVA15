import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberApp extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton b;

    public NumberApp() {
        setTitle("Previous and Next Number Finder");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Labels
        JLabel l1 = new JLabel("Enter Number:");
        JLabel l2 = new JLabel("Previous Number:");
        JLabel l3 = new JLabel("Next Number:");

        // Text fields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        // Make output fields non-editable
        t2.setEditable(false);
        t3.setEditable(false);

        // Button
        b = new JButton("Show Result");
        b.addActionListener(this);

        // Add components to frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(new JLabel("")); // empty cell
        add(b);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(t1.getText());
            t2.setText(String.valueOf(num - 1));
            t3.setText(String.valueOf(num + 1));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new NumberApp();
    }
}
