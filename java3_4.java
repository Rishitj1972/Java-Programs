//Find the factorial of a number
class java3_4
	{
		public static void main(String arg[])
		{
			int n = Integer.parseInt(arg[0]);
			
			int fact = 1;
			
			for(int i = 1;i<=n;i++)
			{
				fact = fact *i;
			}
			System.out.println("Factorial of the number is "+fact);
		}
	}
