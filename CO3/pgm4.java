// Main Inheritance Program with Array of object concept

import java.util.Scanner;
class Person
{
    int age;
    String name,address,gender;
    Person(String name,int age,String gender,String address)
        {
            this.age = age;
            this.name = name;
            this.gender = gender;
            this.address = address;
        }
    void display1()
    {
        System.out.println();
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Address = "+address);
        System.out.println("Gender = "+gender);
    }
}
class Employee extends Person
{
    int emp_id;
    String c_name,Qualification;
    float salary;
    Employee(String name,int age,String gender,String address,int emp_id,String c_name,String Qualification,float salary)
    {
        super(name,age,address,gender);         
        this.emp_id=emp_id;        
        this.c_name=c_name;
        this.Qualification=Qualification;
        this.salary=salary;
    }
    void display2()
    {
        display1();
        System.out.println("Employee Id : "+emp_id);
        System.out.println("Company_name : "+c_name);
        System.out.println("Qualification : "+Qualification);
        System.out.println("Salary : "+salary);
    }
}
class Teacher extends Employee
{
    String subject,Department;
    int t_id;
    Teacher(String name,int age,String gender,String address,int emp_id,String c_name,String Qualification,float salary,int t_id,String subject,String Department)
    {
        super(name,age,address,gender,emp_id,c_name,Qualification,salary);
        this.subject = subject;
        this.Department = Department;
        this.t_id=t_id;
    }
    void display3()
    {
        display2();
        System.out.println("Teacer ID : "+t_id);
        System.out.println("Subject : "+subject);
        System.out.println("Department : "+Department);     }
}
class pgm4
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);        
        System.out.println("Enter the limit : ");
        int n = ob.nextInt();
        Teacher t[] = new Teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println();
            System.out.println("Enter the name : ");
            String name = ob.next();
            System.out.println("Enter the Age : ");
            int age = ob.nextInt();
            System.out.println("Enter the Address : ");
            String address = ob.next();
            System.out.println("Enter the Gender : ");
            String gender = ob.next();
            System.out.println("Enter the Employee ID : ");
            int emp_id = ob.nextInt();
            System.out.println("Enter the Company Name : ");
            String c_name = ob.next();
            System.out.println("Enter the Qualification : ");
            String Qualification=ob.next();
            System.out.println("Enter the Salary : ");
            float salary = ob.nextFloat();
            System.out.println("Enter the Teacher ID : ");
            int t_id = ob.nextInt();
            System.out.println("Enter the Subject : ");
            String subject = ob.next();
            System.out.println("Enter the Department : ");
            String Department = ob.next();
            t[i] = new Teacher(name,age,address,gender,emp_id,c_name,Qualification,salary,t_id,subject,Department);             
            t[i].display3();
        }
    }
}
