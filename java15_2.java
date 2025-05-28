/*Create a class ‘Employee’ with data members Empid, Name, Salary,
Address and constructors to initialize the data members. Create another
class ‘Teacher’ that inherit the properties of class employee and contain
its own data members department, Subjects taught and constructors to
initialize these data members and also include display function to
display all the data members. Use array of objects to display details of
N teachers.*/


import java.util.*;
class Employee
{
 int eid;
 double salary;
 String name;
 Employee(String n,int eid ,double s)
 {
   name=n;
   this.eid=eid;
   salary=s;
  }
 void show()
 {
 System.out.println("ID      : "+eid);
 System.out.println("NAME    : "+name);
 System.out.println("SALARY  : "+salary);
 }
}
class Teacher extends Employee
{
String dept,subj;
Teacher(String n,int e,double ss,String d,String s)
{ super(n,e,ss);
dept=d;
subj=s;
}
void display()
{
show();
System.out.println(" DEPARTMENT:   "+dept);
System.out.println(" SUBJECT   :   "+subj);

}
}
public class java15_2
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
Teacher ob[]=new Teacher [10];
System.out.println("enter no.of Teacher");
int n=in.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("ENTER ID ,NAME, SALARY,DEPARTMENT AND SUBJECT RESPECTIVELY");
int id=in.nextInt();
String na=in.next();
double ss=in.nextDouble();
String dpt=in.next();
String sub=in.next();
ob[i]=new Teacher(na,id,ss,dpt,sub);
}
System.out.println("STUDENT DETAILS ");
for(int i=0;i<n;i++)
{
System.out.println((i+1)+")");
ob[i].display();
}
}
}
