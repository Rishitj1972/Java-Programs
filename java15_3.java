/*
Create a class ‘Person’ with data members Name, Gender, Address, Age
and a constructor to initialize the data members and another class
‘Employee’ that inherits the properties of class Person and also
contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its
own data
members like Subject, Department, Teacherid and also
contain constructors and methods to display the data members. Use
array of objects to display details of N teachers.
*/

import java.util.*;

class Person
	{
		String name,gender,address;
		int age;
		
		Person(String name,String gender,String address,int age)
			{
				this.name = name;
				this.gender = gender;
				this.address = address;
				this.age = age;
			}
		void display()
			{
				System.out.println("Name : "+name);
				System.out.println("Gender : "+gender);
				System.out.println("Adress : "+address);
				System.out.println("Age : "+age);
			}
	}

class Employee extends Person
	{
		int empid,salary;
		String c_name,qualification;
		Employee(String name, String gender, String address, int age, int empid, String c_name, String qualification, int salary)
			{
				super(name,gender,address,age);
				this.empid = empid;
				this.c_name = c_name;
				this.salary = salary;
				this.qualification = qualification;
			}
		void display2()
			{
				display();
				System.out.println("Employee ID : "+empid);
				System.out.println("Employee Name : "+name);
				System.out.println("Salary : "+salary);
				System.out.println("Qualification : "+qualification);
			}
	}

class Teacher extends Employee
	{
		String subject,department;
		int t_id;
		Teacher(String name, String gender, String address, int age, int empid, String c_name, String qualification, int salary, String subject, String department, int t_id)
			{
				super(name, gender, address, age, empid, c_name, qualification, salary);
				this.subject = subject;
				this.department = department;
				this.t_id = t_id;
			}
		void display3()
			{
				display2();
				System.out.println("Subject : "+subject);
				System.out.println("Department : "+department);
				System.out.println("Teacher id : "+t_id);
			}
	}

class java15_3
	{	
		public static void main(String[] args)
		{
		int n;
		Scanner ob = new Scanner(System.in);
		Teacher t[] = new Teacher[10];
		System.out.println("Enter the limit: ");
		n = ob.nextInt();
		for(int i=0;i<n;i++)
			{
				System.out.println("Enter the name : ");
				String name = ob.next();
				System.out.println("Enter the gender : ");
				String gender = ob.next();
				System.out.println("Enter the address : ");
				String address = ob.next();
				System.out.println("Enter the age : ");
				int age = ob.nextInt();
				System.out.println("Enter the Emp id  : ");
				int empid = ob.nextInt();
				System.out.println("Enter the company name : ");
				String c_name = ob.next();
				System.out.println("Enter the quali : ");
				String qualification = ob.next();
				System.out.println("Enter the salary : ");
				int salary = ob.nextInt();
				System.out.println("Enter the subject : ");
				String subject = ob.next();
				System.out.println("Enter the department : ");
				String department = ob.next();
				System.out.println("Enter the id :  : ");
				int t_id = ob.nextInt();
				
				t[i] = new Teacher(name,gender,address,age,empid,c_name,qualification,salary,subject,department,t_id);
				t[i].display3();	
			}
		}
	}
