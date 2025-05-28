//4.3 Read 2 matrices and perform matrix addition and multiplication 
import java.util.*;
public class java4_3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n1,n2,n3,n4;
int m1[][]=new int[5][5];
int m2[][]=new int[5][5];
int m3[][]=new int[5][5];
int m4[][]=new int[5][5];
System.out.println("enter array1 order");
n1=in.nextInt();
n2=in.nextInt();
System.out.println("enter array2 order");
n3=in.nextInt();
n4=in.nextInt();
System.out.println("enter array1 ");
for (int i=0;i<n1;i++)
{
for(int j=0;j<n2;j++)
{
m1[i][j]=in.nextInt();
}
}
System.out.println("enter array2 ");
for (int i=0;i<n1;i++)
{
for(int j=0;j<n2;j++)
{
m2[i][j]=in.nextInt();
}
}
if(n1==n3 && n2==n4)
{

for (int i=0;i<n1;i++)
{
for(int j=0;j<n2;j++)
{
m3[i][j]=m1[i][j]+m2[i][j];

}
}
 System.out.println("matrix addition");
 for(int i=0;i<n1;i++)
{
 for (int j=0;j<n1;j++)
 {System.out.print(m3[i][j]+"  ");
 }
 System.out.println();
 }
 
}
else
System.out.println("addition not possible");
if(n1==n4 && n2==n3)
{
for(int i=0;i<n1;i++)
{
 for (int j=0;j<n1;j++)
 {
 m4[i][j]=0;
 for(int k=0;k<n1;k++)
 {
 m4[i][j]+=m1[i][k]*m2[k][j];
 }
 }
 }
 System.out.println("matrix product");
 for(int i=0;i<n1;i++)
{
 for (int j=0;j<n1;j++)
 {System.out.print(m4[i][j]+"   ");
 }
 System.out.println();
 }
 }

 else
 System.out.println("multiplication not possible ");
 }
} 


