// Read first character from the FIle

import java.io.FileInputStream;

class Co4_3
{
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("Rishi.txt");
            int i = f.read();
            System.out.println((char)i);
            f.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}