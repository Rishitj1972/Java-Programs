//Read a matrix from the console and check whether it is symmetric or not.

import java.util.*;

public class java6_4
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,m,k=0;
System.out.println("enter matrix1 order");
n=in.nextInt();
m=in.nextInt();
int m1[][]=new int[n][m];
System.out.println("enter matrix1 ");
for (int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
m1[i][j]=in.nextInt();
}
}
for (int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
if(m1[i][j]!=m1[j][i])
{k=1;
break;
}
}
}
if(k==0)
System.out.println("its symmetric");
else
System.out.println("its not symmetric");
  }
 
}


