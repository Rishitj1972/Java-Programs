//Print the 3-digit Armstrong numbers between two intervals

import java.util.*;

public class java6_2
{
public static void main(String args[])
{

Scanner in=new Scanner(System.in);
int n,un,s=0,j,a;
System.out.println("enter lower and upper limit");
n=in.nextInt();
un=in.nextInt();
System.out.println("amstrong numbers between "+n+"and "+un);

for(int i=n;i<=un;i++)
{
  j=i;
   while(j>0)
  { 
  a=j%10;
  s=s+(int)Math.pow(a,3);
  j=j/10;
  }
  if(s==i)
  System.out.println(i);
  s=0;
  a=0;
  j=0;
 }
 }
 }
