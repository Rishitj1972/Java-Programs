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
	Employee(double salary)
	{
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
		System.out.println("Enter the Employee Name : ");
		String name = ob.next();
		System.out.println("Enter the Age : ");
		int age = ob.nextInt();
		System.out.println("Enter the Salary : ");
		double salary = ob.nextDouble();
		
		Person p = new Person();
		p.getdata(name,age);
		Employee e = new Employee(salary);
		p.display1();
		e.display2();
	}
}
