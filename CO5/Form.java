import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Action1 implements  ActionListener
{
    TextField uname,passwd;
    Button btn;
    Label l1,l2,o1,o2;
    Action1()
    {
        Frame f = new Frame("Login");

        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);

        l1 = new Label("Username ");
        l1.setBounds(50,120,70,30);
        l2 = new Label("Password ");
        l2.setBounds(50,170,70,30);

        uname = new TextField();
        uname.setBounds(150,120,150,30);
        passwd = new TextField();
        passwd.setBounds(150,170,150,30);

        btn = new Button("Submit");
        btn.setBounds(125,220,80,40);


        f.add(l1);
        f.add(l2);
        f.add(uname);
        f.add(passwd);
        f.add(btn);

        btn.addActionListener(this);

        o1 = new Label();
        o1.setBounds(50,270,80,40);
        o2 = new Label();
        o2.setBounds(140,270,80,40);

        f.add(o1);
        f.add(o2);

    }
    
    public void actionPerformed(ActionEvent e)
    {
        String user = uname.getText();
        String pass = passwd.getText();

        o1.setText("Username : "+user);
        o2.setText("Password : "+pass);
    }
}

class Form
{
    public static void main(String[] args) {
        Action1 b = new Action1();
    }
}