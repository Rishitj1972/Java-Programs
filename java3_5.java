class java3_5
	{
		public static void main(String arg[])
			{
				int n = Integer.parseInt(arg[0]);
				
				for(int i=n;i>=1;i--)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(" * ");
					}
					System.out.println();
				}
			}
	}
