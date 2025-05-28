import java.util.*;

class java20_1
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);		
		
		try{
		
		System.out.println("Enter the number1 : ");
		int a = ob.nextInt();
		
		System.out.println("Enter the number2 : ");
		int b = ob.nextInt();
		
		int c = a/b;
		
		System.out.println("C = "+c);
	}catch (ArithmeticException e)
	{
		System.out.println("Error : "+e);
	}
	}
}
