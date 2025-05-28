//Print the Fibonacci Series up to a limit

class java3_1
{
	public static void main(String arg[])
	{
		int n = Integer.parseInt(arg[0]);
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			int c = a + b;
			a = b;
			b = c;
			System.out.println((c));
		}				
	}
}
