// Best Login Form method

import java.awt.event.*;
import javax.swing.*;

class Action1 implements ActionListener
{
    JLabel l1,l2,output;
    JButton btn;
    JTextField t1;
    JPasswordField t2;

    Action1()
    {
        JFrame f = new JFrame("Login");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);

        l1 = new JLabel("Username ");
        l1.setBounds(50,75,100,30);
        f.add(l1);
        l2 = new JLabel("Password ");
        l2.setBounds(50,125,100,30);
        f.add(l2);
        t1 = new JTextField();
        t1.setBounds(150,75,150,30);
        f.add(t1);
        t2 = new JPasswordField();
        t2.setBounds(150,125,150,30);
        f.add(t2);
        btn = new JButton("Login");
        btn.setBounds(125,175,100,40);
        f.add(btn);
        output = new JLabel();
        output.setBounds(50,240,300,40);
        f.add(output);

        btn.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String data = "Username : "+t1.getText();
        data += " Password : "+ new String(t2.getPassword());
        output.setText(data);
    }
}

class Form_Swing 
{
    public static void main(String[] args) {
        Action1 ob = new Action1();
    }
}