// Extending Method

import javax.swing.*;

public class SimpleForm2 extends JFrame
{
    SimpleForm2()
    {
        setTitle("Frame Title");
        setSize(400,500);
        setVisible(true);
        
        JButton b = new JButton("Submit");
        b.setBounds(130,100,100,40);

        add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new SimpleForm2();
    }
}