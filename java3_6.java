//Print the multiplication table of a given number

class java3_6
	{
		public static void main(String arg[])
			{	
				int n = Integer.parseInt(arg[0]);
				
				for(int i=1;i<=10;i++)
				{
					int s = i * n;
					System.out.println(i +"*"+ n+" = " +s);
				}
			}
	}
