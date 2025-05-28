class java1_7
{
	public static void main(String arg[])
	{
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);
		
		int result = a > b ? a:b;
		
		System.out.println("Largest is "+result);
	}
}
