/*Read 2 matrices from the console and perform matrix addition and
multiplication using class and object*/

import java.util.*;
class Matrix
{

public int a[][];
public int b[][];
public int c[][] = new int[5][5];
public int r1,r2,c1,c2;


public Matrix(int r1,int r2,int c1, int c2)
{
a = new int[r1][c1];
b = new int[r2][c2];
this.r1 = r1;
this.r2 = r2;
this.c1 = c1;
this.c2 = c2;
}

public void read()
{
Scanner ob = new Scanner(System.in);
System.out.println("Enter the elements for matrix 1: ");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
a[i][j] = ob.nextInt();
}
}
System.out.println("Enter the elements for matrix 1: ");
for(int i=0;i<r2;i++)
{
for(int j=0;j<c2;j++)
{
b[i][j] = ob.nextInt();
}
}
}

public void addition()
{
if(r1 == r2 && c1 == c2)
{
for(int i=0;i<r1;i++)
{
for(int j=0;j<r2;j++)
{
c[i][j] += a[i][j] + b[i][j];
}
}
}
System.out.println("Matrix Addition : ");
for(int i=0;i<r1;i++)
{
for(int j=0;j<r2;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}


public void multiplication()
{
if(r1 == c2 && r2 == c1)
{
for(int i=0;i<r1;i++)
{
 for (int j=0;j<r1;j++)
 {
 c[i][j]=0;
 for(int k=0;k<r1;k++)
 {
 c[i][j]+=a[i][k]*b[k][j];
 }
 }
}
System.out.println("matrix product");
 for(int i=0;i<r1;i++)
{
 for (int j=0;j<r1;j++)
 {System.out.print(c[i][j]+"   ");
 }
 System.out.println();
 }
}
}



}


class java8_3
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int r1,r2,c1,c2;
System.out.println("Enter the r1: ");
r1 = input.nextInt();
System.out.println("Enter the r2: ");
r2= input.nextInt();
System.out.println("Enter the c1: ");
c1 = input.nextInt();
System.out.println("Enter the c2: ");
c2 = input.nextInt();

Matrix ob = new Matrix(r1,r2,c1,c2);
ob.read();
ob.addition();
ob.multiplication();
}
}
