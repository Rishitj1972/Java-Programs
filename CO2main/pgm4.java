import java.util.*;

class pgm4
{
    static public int number( int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else{
            return n + number(n - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the limit : ");
        int n = ob.nextInt();
        
        int result = number(n);
        System.out.println(result);
    }
}