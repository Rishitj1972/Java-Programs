//Perform constructor overloading.

import java.util.*;

class Student
	{
		int m1,m2,m3;
		double m4,m5;
		Student(int mark1,int mark2)
			{
				 m1 = mark1;
				 m2 = mark2;
			}
		Student(int mark1,int mark2,int mark3)
			{
				 m1 = mark1;
				 m2 = mark2;
				 m3 = mark3;
			}
		Student(double mark4,double mark5)
			{
				 m4 = mark4;
				 m5 = mark5;
			}
		void calculate()
			{
				int sum2 = m1+m2+m3;
				System.out.println("SUm = "+sum2);
				double sum3 = m4+m5;
				System.out.println("SUm = "+sum3);
			}
	}

class java12_2
	{
		public static void main(String[] args)
			{
				Scanner ob = new Scanner(System.in);
				int n1 = ob.nextInt();
				int n2 = ob.nextInt();
				int n3 = ob.nextInt();
				double n4 = ob.nextDouble();
				double n5 = ob.nextDouble();
				Student ob1 = new Student(n1,n2);
				Student ob2 = new Student(n1,n2,n3);
				Student ob3 = new Student(n4,n5);
				ob1.calculate();
				ob2.calculate();
				ob3.calculate();
			}
	}
