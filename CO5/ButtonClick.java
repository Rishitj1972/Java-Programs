import java.awt.*;
import java.awt.event.*;

class CBD implements ActionListener {
    // Make buttons class-level variables
    Button b1, b2, b3;

    public CBD() {
        Frame f = new Frame("Button Click");

        // Initialize Frame
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        // Create Buttons
        b1 = new Button("OK");
        b1.setBounds(20, 120, 100, 30);
        b2 = new Button("Cancel");
        b2.setBounds(140, 120, 100, 30);
        b3 = new Button("Exit");
        b3.setBounds(260, 120, 100, 30);

        // Add buttons to frame
        f.add(b1);
        f.add(b2);
        f.add(b3);

        // Register the listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Add window closing functionality
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // Compare source of event with button instances
        if (e.getSource() == b1) {
            System.out.println("Button pressed is OK");
        } else if (e.getSource() == b2) {
            System.out.println("Button pressed is Cancel");
        } else if (e.getSource() == b3) {
            System.out.println("Button pressed is Exit");
            System.exit(0);
        }
    }
}

public class ButtonClick {
    public static void main(String[] args) {
        new CBD(); // Creates GUI window
    }
}
