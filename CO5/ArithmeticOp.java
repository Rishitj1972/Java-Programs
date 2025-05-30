import java.awt.event.*;
import javax.swing.*;

class Calc implements ActionListener
{
    JButton add,sub,mul,div,reset;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;

    Calc() 
    {
        // Frame
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        // Labels
        l1 = new JLabel("Number 1");
        l1.setBounds(50,100,100,30);
        f.add(l1);
        l2 = new JLabel("Number 2");
        l2.setBounds(50,150,100,30);
        f.add(l2);
        l3 = new JLabel("Result");
        l3.setBounds(50,200,100,30);
        f.add(l3);

        // TextFields
        t1 = new JTextField();
        t1.setBounds(120,100,150,30);
        f.add(t1);
        t2 = new JTextField();
        t2.setBounds(120,150,150,30);
        f.add(t2);
        t3 = new JTextField();
        t3.setBounds(120,200,150,30);
        f.add(t3);

        // Buttons
        add = new JButton("SUM");
        add.setBounds(50,270,70,30);
        f.add(add);
        sub = new JButton("SUB");
        sub.setBounds(120,270,70,30);
        f.add(sub);
        mul = new JButton("MUL");
        mul.setBounds(190,270,70,30);
        f.add(mul);
        div = new JButton("DIV");
        div.setBounds(260,270,70,30);
        f.add(div);
        reset = new JButton("Reset");
        reset.setBounds(330,270,70,30);
        f.add(reset);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        reset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        double a=0,b=0,c=0;

        try {
            a = Double.parseDouble(t1.getText());
        } catch (NumberFormatException z) {
            t1.setText("Invalid Input");
        }
        
        try {
            b = Double.parseDouble(t2.getText());
        } catch (NumberFormatException z) {
            t2.setText("Invalid Input");
        }

        if(e.getSource() == add)
        {
            c = a + b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource() == sub)
        {
            c = a - b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource() == mul)
        {
            c = a * b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource() == div)
        {
            c = a / b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource() == reset)
        {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
    }
}

class ArithmeticOp 
{
    public static void main(String[] args) {
        Calc ob = new Calc();
    }
}