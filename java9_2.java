import java.util.*;
class Employee
	{
		int emp_id;
		String emp_name;
		float basic_salary,hra,da,gross_salary;
		
		Employee(int id,String name,float salary)
			{
				this.emp_id = id;
				this.emp_name = name;
				this.basic_salary = salary;
			}
		
		public void calculate()
			{
				hra = (basic_salary * 5)/100;
				da = (basic_salary * 50)/100;
				gross_salary = basic_salary + hra + da;
			}
			
		public void display()
			{
				System.out.println("Employee Id = "+emp_id);
				System.out.println("Name  = "+emp_name);
				System.out.println("HRA = "+hra);
				System.out.println("DA = "+da);
				System.out.println("Basic Salary = "+basic_salary);
				System.out.println("Gross Salary = "+gross_salary);
			}
	}

class java9_2
	{
		public static void main(String[] args)
			{
				Scanner ob = new Scanner(System.in);
				int id;
				String name;
				float basic_salary;
				
				System.out.println("Enter the Number of Employees: ");
				int n = ob.nextInt();
				Employee emp[] = new Employee[n];
				for(int i=0;i<n;i++)
					{
						System.out.println("Enter the Employee Id : ");
						id = ob.nextInt();
						ob.nextLine();
						System.out.println("Enter the Employee Name : ");
						name = ob.nextLine();
						System.out.println("Enter the basic Salary: ");
						basic_salary = ob.nextFloat();
						
						emp[i] = new Employee(id,name,basic_salary);
						emp[i].calculate();
						System.out.println("Details of the Employee+"+( i + 1 )+" is");
						System.out.println();
						emp[i].display();
					}		
			}
	}
