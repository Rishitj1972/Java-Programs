import java.util.*;

class Person
{
String name;
int age;

	void getdata(String name,int age)
	{
		this.name = name;
		this.age = age;	
	}
	void display1()
	{
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
}

class Employee extends Person
{
	double salary;
	Employee(String name,int age,double salary)
	{
		super(name,age);
		this.salary = salary;
	}
	void display2()
	{
		System.out.println("Salary : "+salary);
	}
}

class java2
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Student Name : ");
		String name = ob.next();
		System.out.println("Enter the Age : ");
		int age = ob.nextInt();
		System.out.println("Enter the Salary : ");
		double salary = ob.nextDouble();
		
		Employee e = new Employee(name,age,salary);
		e.display1();
		e.display2();
		
	}
}
