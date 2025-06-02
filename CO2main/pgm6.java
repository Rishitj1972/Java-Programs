import java.util.*;

class pgm6 
{
    static int reversed = 0;
    
    public static void reverse(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            int a = n % 10;
            reversed = reversed * 10 + a;
            reverse(n/10);
        }
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        reverse(n);
        System.out.println("Reversed  = "+reversed);
    }
}