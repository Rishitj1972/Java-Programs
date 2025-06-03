
import java.io.*;

class Co4_1
{
    public static void main(String[] args)
    {
        try{
            File myfile = new File("Rishi.txt");
            
            if(myfile.createNewFile())
            {
                System.out.println("New File Created : "+myfile.getName());
            }
            else
            {
                System.out.println("File already Exists");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}