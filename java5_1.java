import java.util.*;
class java5_1
{
	public static void main(String arg[])
	{
		Scanner ob = new Scanner(System.in);
		int l;
		String s1,s2=" ";
		s1=ob.nextLine();
		l = s1.length();
		for(int i=l-1;i>=0;i--)
			{
				s2+=s1.charAt(i);	
			}			
			System.out.println(s2);
	}
}
