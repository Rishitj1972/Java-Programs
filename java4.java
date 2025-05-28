import java.util.*;
class Employee
{
double salary;
void calculate()
{ 
Scanner in= new Scanner(System.in);
System.out.println(" enter employee salary");
salary=in.nextDouble();
System.out.println("employee salary : "+salary);
}
}
class manager extends Employee
{
double s;
void calculate()
{ Scanner in= new Scanner(System.in);
System.out.println(" enter manager salary");
s=in.nextDouble();
System.out.println("manager salary : "+s);
}
}
class programmer extends Employee
{
double s;
void calculate()
{ Scanner in= new Scanner(System.in);
System.out.println(" enter programmer salary");
s=in.nextDouble();
System.out.println("programmer salary : "+s);
}
}
public class java4
{
public static void main(String args[])
{
programmer ob=new programmer();
ob.calculate();
manager ob1=new manager();
ob1.calculate();
Employee obb=new Employee();
obb.calculate();
}
}
