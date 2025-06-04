import java.awt.*;
import java.awt.event.*;

class Concentric extends Frame {
    Color c1, c2, c3, c4, c5, c6;

    public Concentric() {
        setTitle("Concentric Circles");
        setSize(600, 600);
        setVisible(true);

        c1 = new Color(220, 20, 60);
        c2 = new Color(30, 144, 255);
        c3 = new Color(50, 205, 50);
        c4 = new Color(218, 165, 32);
        c5 = new Color(186, 85, 211);
        c6 = new Color(160, 45, 90);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(c1);
        g.fillOval(50, 50, 500, 500);

        g.setColor(c2);
        g.fillOval(90, 90, 420, 420);

        g.setColor(c3);
        g.fillOval(130, 130, 340, 340);

        g.setColor(c4);
        g.fillOval(170, 170, 260, 260);

        g.setColor(c5);
        g.fillOval(210, 210, 180, 180);

        g.setColor(c6);
        g.fillOval(250, 250, 100, 100);
    }

    public static void main(String[] args) {
        new Concentric();
    }
}
