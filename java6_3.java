//Search an element in an array
import java.util.*;

public class java6_3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,t,s,k=0;
int arr[]=new int[10];
System.out.println("enter array size");
n=in.nextInt();
System.out.println("enter array elements :");
for(int i=0;i<n;i++)
{ 
arr[i]=in.nextInt();
}
System.out.println("enter value to search");
s=in.nextInt();
for(int i=0;i<n;i++)
{
if(s==arr[i])
{
 k=1;
 break;
 }
 }
if(k==1)
System.out.println("search sucessful");
else
System.out.println("search unsucessful");
}
}	
