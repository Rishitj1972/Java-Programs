/*
Perform method overloading.
Hint:- Defining 3 methods having same name. One method accepts two integer
parameters to add them. Second method accepts 3 double values and adds them.
The third method accepts one integer argument and one double argument and
adds them.
*/

class Student
{
	
	void calculate(int mark1,int mark2)
	{
		int sum = mark1 + mark2;
		System.out.println("Sum 1 = "+sum);
	
	}
	
	void calculate(double mark1,double mark2,double mark3)
	{
		double sum2 = mark1+mark2+mark3;
		System.out.println("Sum 2 = "+sum2);

	}
	
	void calculate(int mark1,double mark2)
	{
		double sum3 = mark1+mark2;
		System.out.println("Sum 3 = "+sum3);
	}
}

class java12_1
	{
		public static void main(String[] args)
			{
				Student ob = new Student();
				ob.calculate(12,15);
				ob.calculate(12.52,12.20,12.30);
				ob.calculate(12,12.52);
			}
	}
