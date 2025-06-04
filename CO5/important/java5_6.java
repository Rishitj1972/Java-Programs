import java.awt.event.*;
import javax.swing.*;

class Action implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton btn;
    Action()
    {
        JFrame f = new JFrame();
        f.setTitle("Greatest of three numbers");
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
        l3 = new JLabel("Number 3");
        l3.setBounds(50,150,100,30);
        f.add(l3);

        t1 = new JTextField();
        t1.setBounds(120,50,150,30);
        f.add(t1);
        t2 = new JTextField();
        t2.setBounds(120,100,150,30);
        f.add(t2);
        t3 = new JTextField();
        t3.setBounds(120,150,150,30);
        f.add(t3);

        btn = new JButton("Find");
        btn.setBounds(130,200,70,40);
        f.add(btn);

        l4 = new JLabel();
        l4.setBounds(50,230,200,30);
        f.add(l4);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        double a=0,b=0,c=0,max=0;

            a = Double.parseDouble(t1.getText());
            b = Double.parseDouble(t2.getText());
            c = Double.parseDouble(t3.getText());

        if(e.getSource() == btn)
        {
            if(a > b && a > c)
            {
                max = a;
            }
            else if(b > c)
            {
                max = b;
            }
            else 
            {
                max = c;
            }
        }
        l4.setText("Greatest Number : "+max);
    }
}

class java5_6
{
    public static void main(String[] args) {
        new Action();
    }
}