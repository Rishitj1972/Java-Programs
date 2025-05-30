import java.awt.*;

class SmileyFace extends Frame {
    Color faceColor, eyeColor;

    SmileyFace() {
        setTitle("Smiley Face");
        setSize(600, 700);
        setVisible(true);
        faceColor = new Color(219, 225, 44); // Yellow face
        eyeColor = new Color(0, 0, 0);       // Black eyes/mouth
    }

    public void paint(Graphics g) {
        // Face (circle)
        g.setColor(faceColor);
        g.fillOval(100, 100, 400, 400); // x, y, width, height

        // Eyes (half circles)
        g.setColor(eyeColor);
        g.fillArc(170, 230, 75, 75, 0, -180); // Left eye (upper arc)
        g.fillArc(355, 230, 75, 75, 0, -180); // Right eye

        // Mouth (arc smile)
        g.setColor(eyeColor);
        g.fillArc(200, 280, 200, 150, 0, -180); // Smile (downward arc)

    }

    public static void main(String[] args) {
        new SmileyFace();
    }
}
