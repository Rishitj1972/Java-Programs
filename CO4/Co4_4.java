
import java.io.FileInputStream;


class Co4_4
{
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("Rishi.txt");
            int i = 0;
            while((i=f.read()) != -1)
            {
                System.out.print((char)i);
                System.out.println();
            }
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}