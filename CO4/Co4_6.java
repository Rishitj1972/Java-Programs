
import java.io.File;
import java.util.Scanner;

class Co4_6
{
    public static void main(String[] args) {
        File currFiles = new File(".");
        System.out.println("Files in current directory ");
        File[] files = currFiles.listFiles();
        if(files != null)
        {
            for(File f : files)
            {
                if(f.isDirectory())
                {
                    System.out.println("[DIR] "+f.getName());
                }
                else
                {
                    System.out.println("[FILE] "+f.getName());
                }
            }
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the file name to search ");
            String fname = ob.nextLine();
            boolean found = false;
            for(File f : files)
            {
                if(f.isFile() && f.getName().equalsIgnoreCase(fname))
                {
                    System.out.println("File "+f.getName()+" is found in "+f.getAbsolutePath());
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                System.out.println("File Not Found");
            }
        }
        else 
        {
            System.out.println("Unable to read directory");
        }
    }
}