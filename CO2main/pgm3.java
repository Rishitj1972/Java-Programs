import java.util.*;

class pgm3
{
    static public int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }else
        {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the limit : ");
        int n1 = ob.nextInt();
        
        int result = factorial(n1);
        System.out.println("Factorial is "+result);
    }
}
