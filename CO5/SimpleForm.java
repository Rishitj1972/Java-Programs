//Instantiating method

import javax.swing.*;

public class SimpleForm
{
    SimpleForm()
    {
        JFrame f = new JFrame("Swing Frame"); //creating an instance of JFrame

        JButton b = new JButton("Submit");

        f.add(b);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new SimpleForm();
    }
}