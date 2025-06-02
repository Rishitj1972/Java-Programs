import java.util.*;

class pgm5 
{
    public static void printNumber(int n)
    {
        printRecursive(1,n);
    }
    public static void printRecursive(int current,int n)
    {
        if(current > n)
        {
            return;
        }
        System.out.println(current);
        printRecursive(current + 1,n);
    }
    
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        
        printNumber(n);
    }
}