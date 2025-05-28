//Find the sum of first ‘N’ natural numbers using 17.02.2025
// a) while loop
// b) do-while loop
// c) for loop

class java2_6
{
	public static void main(String a[])
	{
		int n = Integer.parseInt(a[0]);
		
		int i = 1;
		int s = 0;
		
		while(i <= n)
		{
			s = s+i;
			i++;
		}		
		System.out.println(s);

		i = 1;
		s = 0;
		
		do
		{
			s = s + i;
			i++;
		}while(i <= n);
		System.out.println(s);		
		
		s = 0;
		for(i=1;i<=n;i++)
		{
			s = s + i;
		}
		System.out.println(s);

	}
}
