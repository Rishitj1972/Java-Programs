import java.util.*;
class Student
{
	int rollno;
	String name;
	static int count = 0;
	
	Student(int rollno,String name)
	{
	this.rollno = rollno;
	this.name = name;
	count++;
	}
	static void count()
	{
		System.out.println("Count of the students : "+count);
	}
}

class java11_1
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Number of Students :");
		int n = ob.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Roll no : ");
			int rollno = ob.nextInt();
			System.out.println("Enter the Name : ");
			String name = ob.next();
			Student s = new Student(rollno,name);
		}
		System.out.println();
		Student.count();
	}
}
