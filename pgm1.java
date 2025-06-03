/*Program with the concepts of inheritance , super keyword , multilevel inheritance.*/

import java.util.*;

class Person 
{
    String name;
    int age;
    
    Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void display1()
    {
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
    }
}

class Employee extends Person
{
    int emp_id,salary;
    
    Employee(String name,int age,int emp_id,int salary)
    {
        super(name,age);
        this.emp_id = emp_id;
        this.salary = salary;
    }
    void display2()
    {
        display1();
        System.out.println("ID : "+emp_id);
        System.out.println("Salary : "+salary);
    }
}

class Teacher extends Employee 
{
    int t_id;
    String dept;
    
    Teacher(String name,int age,int emp_id,int salary,int t_id,String dept)
    {
        super(name,age,emp_id,salary);
        this.t_id = t_id;
        this.dept = dept;
    }
    void display3()
    {
        display2();
        System.out.println("Teacher ID : "+t_id);
        System.out.println("Department : "+dept);
    }
}

class Main 
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Name : ");
        String name = ob.nextLine();
        System.out.println("Age : ");
        int age = ob.nextInt();
        System.out.println("Employee ID : ");
        int emp_id = ob.nextInt();
        System.out.println("Salary : ");
        int salary = ob.nextInt();
        System.out.println("Teacher ID : ");
        int t_id = ob.nextInt();
        ob.nextLine();
        System.out.println("Department : ");
        String dept = ob.nextLine();
        
        Teacher t = new Teacher(name,age,emp_id,salary,t_id,dept);
        t.display3();
    }
}