
import java.io.FileOutputStream;


class Co4_5
{
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("BreakingBad.txt");
            String s = "Iam not in danger Skyler I'm the danger";
            byte b[] = s.getBytes();
            f.write(b);
            f.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}