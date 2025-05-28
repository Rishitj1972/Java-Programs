//Write the following programs
//i) Print the prime numbers up to a limit

import java.util.*;

class java6_1
{
	public static void main(String a[])
	{
	Scanner ob = new Scanner(System.in);
	int s1 = ob.nextInt();
	int s2 = ob.nextInt();
	int flag=0;
	for(int i = s1; i <= s2; i++)
         {
             for(int j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
	}
	}
}
   
