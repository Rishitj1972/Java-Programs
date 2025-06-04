import java.awt.*;
import java.awt.event.*;

class PercentageFace extends Frame implements ActionListener {
    TextField t1, t2, t3, t4, t5;
    Button btn;
    double percentage = -1;

    PercentageFace() {
        setTitle("Percentage & Face Display");
        setSize(500, 600);
        setLayout(null);
        setVisible(true);

        Label l1 = new Label("Physics:");
        l1.setBounds(50, 50, 100, 30);
        add(l1);
        t1 = new TextField();
        t1.setBounds(160, 50, 100, 30);
        add(t1);

        Label l2 = new Label("Chemistry:");
        l2.setBounds(50, 90, 100, 30);
        add(l2);
        t2 = new TextField();
        t2.setBounds(160, 90, 100, 30);
        add(t2);

        Label l3 = new Label("Maths:");
        l3.setBounds(50, 130, 100, 30);
        add(l3);
        t3 = new TextField();
        t3.setBounds(160, 130, 100, 30);
        add(t3);

        Label l4 = new Label("English:");
        l4.setBounds(50, 170, 100, 30);
        add(l4);
        t4 = new TextField();
        t4.setBounds(160, 170, 100, 30);
        add(t4);

        Label l5 = new Label("Malayalam:");
        l5.setBounds(50, 210, 100, 30);
        add(l5);
        t5 = new TextField();
        t5.setBounds(160, 210, 100, 30);
        add(t5);

        btn = new Button("Show Face");
        btn.setBounds(150, 260, 100, 40);
        add(btn);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
            }
        });

        btn.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        try {
            double m1 = Double.parseDouble(t1.getText());
            double m2 = Double.parseDouble(t2.getText());
            double m3 = Double.parseDouble(t3.getText());
            double m4 = Double.parseDouble(t4.getText());
            double m5 = Double.parseDouble(t5.getText());
            
            double total = m1+m2+m3+m4+m5;
            percentage = total / 5;
            repaint();
        } catch (NumberFormatException z) {
            percentage = -1;
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        if(percentage == -1)
        {
            g.setColor(Color.RED);
            g.drawString("Invalid entry",100,100);
            return;
        }

        g.setColor(Color.BLACK);
        g.drawString("Percentage : "+percentage+"%",100,320);

        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(150,350,200,200);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(190,400,20,20);
        g.fillOval(240,400,20,20);

        if(percentage >= 50)
        {
            g.drawArc(190,430,80,50,180,180);
        }
        else
        {
            g.drawArc(190, 470, 80, 50, 0, 180);
        }
    }
    public static void main(String[] args) {
        new PercentageFace();
    }
}