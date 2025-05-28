
import java.util.Scanner;

class java20_2
{
	public static void main(String[] args)
	{
	Scanner ob = new Scanner(System.in);
	
	try{
	
	int[] c = {1,2,3,4,5};
	
	System.out.println(c[6]);
	
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Error : "+e);
	}

	}
}
