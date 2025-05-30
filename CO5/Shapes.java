import java.awt.*;

public class Shapes extends Frame
{
    Color c1;
    Shapes()
    {
        setTitle("Helper Class");
        setSize(600,800);
        setVisible(true);
        c1 = new Color(191,25,47);
    }
    public void paint(Graphics g)
        {
            g.setColor(c1);
            g.drawString("Rectangle",50,170); 
            g.drawRect(50,180,100,100); //x value,y value,width,height
            
            g.drawString("Fill Rectangle",50,300);
            g.fillRect(50,320,100,100); 
            
            g.drawString("Rounded Rectangle",50,440);
            g.drawRoundRect(50,460,100,100,20,20); //x,y,width.height,arc width,arc height

            g.drawString("Fill Rounded Rectangle",50,580);
            g.fillRoundRect(50,600,100,100,20,20);

        }   
    public static void main(String[] args) {
        new Shapes();
    } 
}
