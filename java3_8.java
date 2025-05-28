class java3_8
	{
		public static void main(String arg[])
			{
				int n = Integer.parseInt(arg[0]);
				int rev = 0;
				int temp = n;
				while(n != 0)
					{
						int a = n % 10;
						rev = rev * 10 + a;
						n = n / 10;
					}
				if(rev == temp)
					{
						System.out.println("Palindrome number : "+rev);
					}
				else
					{
						System.out.println("Not palindrome :"+rev);
					}
			}
	}
