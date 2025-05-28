/*Program to demonstrate use of constructors to initialize values to member
variables in a class and to display them.
Hint:- empno , empname and salary are the class members of the class
employee1. From the main function we are passing the values directly to
a constructor, the constructor initializes the values to member variables.
The display function is used to display the stored values of the member
variables.*/

import java.util.*;
class Employee
{
public int empno;
String emp_name;
public int salary;

public Employee(int no, String name, int sal)
{
empno = no;
emp_name = name;
salary = sal;
}

void display()
{
System.out.println("Employee Number : "+empno);
System.out.println("Employee Name : "+emp_name);
System.out.println("Employee Salary : "+salary);
}

}

class java8_2
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

int no,salary;
String name;

System.out.println("Enter the EMployee Number: ");
no = input.nextInt();

System.out.println("Enter the EMployee Name: ");
name = input.next();

System.out.println("Enter the Employee Salary: ");
salary = input.nextInt();

Employee ob = new Employee(no,name,salary);

ob.display();

}
}
