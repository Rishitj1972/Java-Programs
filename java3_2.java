//Find the sum of the digits of a given number

class java3_2
{
	public static void main(String arg[])
	{
		int n = Integer.parseInt(arg[0]);
		int sum = 0;
		
		while(n != 0)
		{
		int a = n % 10;
		sum += a;
		n = n / 10;
		}
		System.out.println("Sum of the digits is : "+sum);
	}
}
