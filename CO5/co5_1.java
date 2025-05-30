import java.awt.*;

class First
{
    public void create()
    {
        Frame f = new Frame("New Frame");
        f.setSize(100,100);
        f.setVisible(true);
    }
}

class co5_1
{
    public static void main(String[] args)
    {
        First f = new First();
        f.create();
    }
}