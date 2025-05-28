//check whether a given string is palindrome or not

import java.util.*;

class java6_6
	{
		public static void main(String arg[])
			{
				Scanner ob = new Scanner(System.in);
				System.out.println("Ente the digit: ");
				String a = ob.nextLine();
				String s="";
				for(int i =a.length()-1 ;i>=0;i--)
				{
					s = s+ a.charAt(i);
				}
				if(a.equals(s))
				{
					System.out.println("Palindrome");
				}
				else
				{
					System.out.println("Not palindrome");
				}
			}
	}
