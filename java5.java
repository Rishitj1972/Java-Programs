/*Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In
each subclass, override the calculateSalary() method to calculate and
return the salary based on their specific roles.*/

import java.util.*;
class Employee
{
double salary;
void calculate()
{ Scanner in= new Scanner(System.in);
System.out.println(" enter employee salary");
salary=in.nextDouble();
System.out.println("employee salary : "+salary);
}
}
class manager extends Employee
{
double s;
void calculate()
{super.calculate();
Scanner in= new Scanner(System.in);
System.out.println(" enter manager salary");
s=in.nextDouble();
System.out.println("manager salary : "+s);
}
}
class programmer extends manager
{
double s;
void calculate()
{super.calculate();
Scanner in= new Scanner(System.in);
System.out.println(" enter programmer salary");
s=in.nextDouble();
System.out.println("programmer salary : "+s);
}
}
public class java5
{
public static void main(String args[])
{
programmer ob=new programmer();
ob.calculate();
}
}
