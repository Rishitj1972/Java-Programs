import java.io.*;

class Co4_2
{
    public static void main(String[] args) {
        String fname = "Rishi.txt";
        
        File f = new File(fname);

        System.out.println("FIle Name : "+f.getName()); //file name
        
        System.out.println("FIle Path : "+f.getPath()); //path

        System.out.println("Absolute Path : "+f.getAbsolutePath()); //full path from its disks onwards

        System.out.println("Exixts : "+f.exists()); //true if exists

        if(f.exists())
        {
            System.out.println("Readable : "+f.canRead()); //readable or not
            System.out.println("Writable : "+f.canWrite()); //writable or not
            System.out.println("Directory : "+f.isDirectory()); //is a directory or not
            System.out.println("File size in bytes : "+f.length()); //length of the contents inside the file
            
        }
    }
}