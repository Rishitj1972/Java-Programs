import java.awt.*;

class java5_1 extends Frame
{
    java5_1()
    {
        setTitle("Circle and Rectangle");
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawOval(50,50,100,100);
        g.drawRect(50,150,100,100);
    }
    public static void main(String[] args) {
        new java5_1();
    }
}