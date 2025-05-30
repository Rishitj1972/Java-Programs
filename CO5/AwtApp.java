import java.awt.*;

public class AwtApp extends Frame
{
    AwtApp()
    {
        setTitle("Main Frame");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        
        Label fname = new Label("First Name");
        fname.setBounds(20,50,80,20);

        Label lname = new Label("Last Name");
        lname.setBounds(20,80,80,20);

        Label dob = new Label("Date Of Birth");
        dob.setBounds(20,110,80,20);

        TextField TF1 = new TextField();
        TF1.setBounds(120,50,100,20);

        TextField TF2 = new TextField();
        TF2.setBounds(120,80,100,20);

        TextField TF3 = new TextField();
        TF3.setBounds(120,110,100,20);

        Button btn = new Button("Submit");
        btn.setBounds(20,160,100,30);

        Button reset = new Button("Reset");
        reset.setBounds(120,160,100,30);

        add(fname);
        add(lname);
        add(dob);
        add(TF1);
        add(TF2);
        add(TF3);
        add(btn);
        add(reset);
    }
    public static void main(String[] args) {
        new AwtApp();
    }
}

