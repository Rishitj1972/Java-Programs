import java.awt.*;
import java.awt.event.*;

class ComicFace extends Frame {
    Color face, eyes1, eyes2, mouth, nose;

    ComicFace() {
        setTitle("Comic Face");
        setSize(600, 600);
        setVisible(true);

        face = new Color(255, 224, 189);      // Face skin color
        eyes1 = new Color(30, 144, 255);      // Iris (blue)
        eyes2 = new Color(255, 255, 255);     // Sclera (white)
        mouth = new Color(220, 20, 60);       // Mouth (red)
        nose = new Color(255, 204, 153);      // Nose (slightly darker skin)

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        // Face
        g.setColor(face);
        g.fillOval(50, 50, 500, 500);

        // Eyes (Sclera - White)
        g.setColor(eyes2);
        g.fillOval(140, 220, 100, 100);  // Left eye white
        g.fillOval(360, 220, 100, 100);  // Right eye white

        // Eyes (Iris - Blue)
        g.setColor(eyes1);
        g.fillOval(165, 245, 50, 50);   // Left iris
        g.fillOval(385, 245, 50, 50);   // Right iris

        // Pupils (Black)
        g.setColor(Color.BLACK);
        g.fillOval(180, 260, 20, 20);   // Left pupil
        g.fillOval(400, 260, 20, 20);   // Right pupil

        // Nose
        g.setColor(nose);
        g.fillOval(270, 310, 60, 40);

        // Mouth
        g.setColor(mouth);
        g.fillArc(200, 370, 200, 100, 0, -180);  // Smile arc
    }

    public static void main(String[] args) {
        new ComicFace();
    }
}
