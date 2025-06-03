
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Co4_8
{
    public static void main(String[] args) throws Exception{
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Provide Source file name: ");
        String source = ob.nextLine();
        System.out.println("Provide Destination file name: ");
        String desti = ob.nextLine();
        
        FileReader fin = new FileReader(source);
        FileWriter fout = new FileWriter(desti,true); 

        int c;
        while((c = fin.read()) != -1)
        {
            fout.write(c);
        }

        System.out.println("Copy finish");
        fin.close();
        fout.close();
    }
}