//Find the largest among 3 numbers

class java3_9
	{
		public static void main(String arg[])
			{
				int n1 = Integer.parseInt(arg[0]);
				int n2 = Integer.parseInt(arg[1]);
				int n3 = Integer.parseInt(arg[2]);
				
				
			if(n1 > n2 && n1 > n3)
				{
					System.out.println("N1 is larger"+n1);
				}
			else if(n2 > n1  && n2 > n3)
				{
					System.out.println("N2 is greater"+n2);
				}
			else if(n3 > n1 && n3 > n2)
				{
					System.out.println("N3 is larger"+n3);
				}
			else
				{
					System.out.println("Equal");
				}
				
			}
	}
