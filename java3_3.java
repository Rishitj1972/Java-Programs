//Check whether the given number is prime or not

class java3_3
	{
	public static void main(String arg[])
		{
			int n = Integer.parseInt(arg[0]);
			int count = 0;
			if(n == 2)
				{
					System.out.println("Number is Prime "+n);
				}
			else
			{
				for(int i = 1;i<=n;i++)
				{
					if(n % i == 0)
					{
						count++;
					}
				}
			}
			if(count == 2)
			{
				System.out.println("Number is Prime"+n);
			}
			else
			{
				System.out.println("Number is not prime "+n);
			}
		}
	}
