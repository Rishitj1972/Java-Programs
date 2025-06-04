import java.awt.*;
import java.awt.event.*;

class Shapes extends Frame 
{
    Shapes()
    {
        setTitle("DIfferent Shapes");
        setSize(800,800);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawLine(100, 150, 150, 50);  // Left side
        g.drawLine(150, 50, 200, 150);  // Right side
        g.drawOval(100, 140, 100, 20);  // Base ellipse

        // 2. Cylinder
        g.setColor(Color.BLUE);
        g.drawOval(300, 50, 100, 20);   // Top ellipse
        g.drawLine(300, 60, 300, 150);  // Left vertical
        g.drawLine(400, 60, 400, 150);  // Right vertical
        g.drawOval(300, 140, 100, 20);  // Bottom ellipse

        // 3. Square inside an Oval
        g.setColor(Color.GREEN);
        g.drawOval(100, 250, 150, 150);           // Oval
        g.setColor(Color.BLACK);
        g.drawRect(125, 275, 100, 100);           // Square inside

        // 4. Circle inside Rounded Square
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(320, 250, 150, 150, 40, 40); // Rounded square
        g.setColor(Color.ORANGE);
        g.drawOval(345, 275, 100, 100);             // Circle inside

    }
    public static void main(String[] args) {
        new Shapes();
    }
}