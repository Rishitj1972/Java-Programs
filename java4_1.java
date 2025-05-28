//Sort an integer array 27.02.2025
import java.util.*;
public class java4_1
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int n,t;
int arr[]=new int[10];
System.out.println("enter array size");
n=in.nextInt();
System.out.println("enter array elements :");
for(int i=0;i<n;i++)
{ 
arr[i]=in.nextInt();
}
for (int i=0;i<n-1;i++)
{
for(int j=0;j<(n-1)-i;j++)
{
if(arr[j]>arr[j+1])
{
  t=arr[j+1];
  arr[j+1]=arr[j];
  arr[j]=t;
  }
 }
 }
System.out.println("array elements are:");
for(int i=0;i<n;i++)
{  
System.out.println(arr[i]);
}
}
}
