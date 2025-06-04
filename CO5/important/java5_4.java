import java.awt.event.*;
import javax.swing.*;

class Action implements ActionListener
{
    JLabel l1,l2;
    JButton btn;
    JTextField t1,t2;

    Action()
    {
        JFrame f = new JFrame();
        f.setTitle("Swap two Numbers");
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Number 1");
        l1.setBounds(50,50,100,30);
        f.add(l1);
        
        l2 = new JLabel("Number 2");
        l2.setBounds(50,100,100,30);
        f.add(l2);

        t1 = new JTextField();
        t1.setBounds(150,50,150,30);
        f.add(t1);

        t2 = new JTextField();
        t2.setBounds(150,100,150,30);
        f.add(t2);

        btn = new JButton("Swap");
        btn.setBounds(150,150,70,40);
        f.add(btn);

        btn.addActionListener(this);
    }   
    public void actionPerformed(ActionEvent e)
    {
        String a = t1.getText();
        String b = t2.getText();

        if(e.getSource() == btn)
        {
            t1.setText(b);
            t2.setText(a);
        }
    }
}

class java5_4   
{
    public static void main(String[] args) {
        Action ob = new Action();
    }
}